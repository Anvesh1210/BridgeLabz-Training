package com.advancedfeatures;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

	// Borrow Book (Transaction)
	public boolean borrowBook(int studentId, int bookId) {

		String checkSQL = "SELECT available_copies FROM books WHERE book_id=?";
		String insertSQL = "INSERT INTO borrow_records (student_id, book_id, borrow_date, due_date) VALUES (?, ?, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 7 DAY))";
		String updateSQL = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id=?";

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			// Check availability
			try (PreparedStatement ps = conn.prepareStatement(checkSQL)) {
				ps.setInt(1, bookId);
				ResultSet rs = ps.executeQuery();
				if (!rs.next() || rs.getInt(1) <= 0) {
					conn.rollback();
					System.out.println("Book Not Available!");
					return false;
				}
			}

			// Insert borrow record
			try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
				ps.setInt(1, studentId);
				ps.setInt(2, bookId);
				ps.executeUpdate();
			}

			// Update inventory
			try (PreparedStatement ps = conn.prepareStatement(updateSQL)) {
				ps.setInt(1, bookId);
				ps.executeUpdate();
			}

			conn.commit();
			return true;

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (Exception ex) {
			}
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}

	// 🔥 Return Book + Fine Calculation
	public boolean returnBook(int borrowId) {

		String selectSQL = "SELECT due_date, book_id FROM borrow_records WHERE borrow_id=?";
		String updateBorrow = "UPDATE borrow_records SET return_date=CURDATE(), fine_amount=? WHERE borrow_id=?";
		String updateBook = "UPDATE books SET available_copies=available_copies+1 WHERE book_id=?";

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			Date dueDate;
			int bookId;

			try (PreparedStatement ps = conn.prepareStatement(selectSQL)) {
				ps.setInt(1, borrowId);
				ResultSet rs = ps.executeQuery();
				if (!rs.next())
					return false;
				dueDate = rs.getDate("due_date");
				bookId = rs.getInt("book_id");
			}

			long diff = (System.currentTimeMillis() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
			double fine = diff > 0 ? diff * 10 : 0;

			try (PreparedStatement ps = conn.prepareStatement(updateBorrow)) {
				ps.setDouble(1, fine);
				ps.setInt(2, borrowId);
				ps.executeUpdate();
			}

			try (PreparedStatement ps = conn.prepareStatement(updateBook)) {
				ps.setInt(1, bookId);
				ps.executeUpdate();
			}

			conn.commit();
			return true;

		} catch (Exception e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (Exception ex) {
			}
			return false;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}

	// 🔎 Multi-filter Search
	public List<Book> searchBooks(String title, String author, String category) {

		StringBuilder sql = new StringBuilder("SELECT * FROM books WHERE 1=1");
		List<Object> params = new ArrayList<>();

		if (title != null && !title.isEmpty()) {
			sql.append(" AND title LIKE ?");
			params.add("%" + title + "%");
		}

		if (author != null && !author.isEmpty()) {
			sql.append(" AND author LIKE ?");
			params.add("%" + author + "%");
		}

		if (category != null && !category.isEmpty()) {
			sql.append(" AND category LIKE ?");
			params.add("%" + category + "%");
		}

		List<Book> list = new ArrayList<>();

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql.toString())) {

			for (int i = 0; i < params.size(); i++) {
				ps.setObject(i + 1, params.get(i));
			}

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"),
						rs.getString("category"), rs.getInt("total_copies"), rs.getInt("available_copies")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
