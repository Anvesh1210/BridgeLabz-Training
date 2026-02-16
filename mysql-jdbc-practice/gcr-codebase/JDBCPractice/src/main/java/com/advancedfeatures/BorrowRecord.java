package com.advancedfeatures;

import java.sql.Date;

public class BorrowRecord {

	private int borrowId;
	private int studentId;
	private int bookId;
	private Date borrowDate;
	private Date dueDate;
	private Date returnDate;
	private double fineAmount;

	public BorrowRecord(int borrowId, int studentId, int bookId, Date borrowDate, Date dueDate, Date returnDate,
			double fineAmount) {
		this.borrowId = borrowId;
		this.studentId = studentId;
		this.bookId = bookId;
		this.borrowDate = borrowDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
		this.fineAmount = fineAmount;
	}

	@Override
	public String toString() {
		return "BorrowID: " + borrowId + " | Student: " + studentId + " | Book: " + bookId + " | Borrow: " + borrowDate
				+ " | Due: " + dueDate + " | Return: " + returnDate + " | Fine: " + fineAmount;
	}
}
