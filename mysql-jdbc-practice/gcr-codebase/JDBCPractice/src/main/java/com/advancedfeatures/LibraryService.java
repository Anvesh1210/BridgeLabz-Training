package com.advancedfeatures;

import java.util.List;
import java.util.Scanner;

public class LibraryService {

	private LibraryDAO dao = new LibraryDAO();
	private Scanner sc = new Scanner(System.in);

	public void borrowBook() {
		System.out.print("Student ID: ");
		int sid = sc.nextInt();
		System.out.print("Book ID: ");
		int bid = sc.nextInt();

		if (dao.borrowBook(sid, bid))
			System.out.println("Book Borrowed Successfully!");
		else
			System.out.println("Borrow Failed!");
	}

	public void returnBook() {
		System.out.print("Borrow ID: ");
		int id = sc.nextInt();

		if (dao.returnBook(id))
			System.out.println("Book Returned Successfully!");
		else
			System.out.println("Return Failed!");
	}

	public void searchBooks() {
		sc.nextLine();
		System.out.print("Title (leave blank if none): ");
		String title = sc.nextLine();
		System.out.print("Author (leave blank if none): ");
		String author = sc.nextLine();
		System.out.print("Category (leave blank if none): ");
		String category = sc.nextLine();

		List<Book> list = dao.searchBooks(title, author, category);
		list.forEach(System.out::println);
	}
}
