package com.advancedfeatures;

import java.util.Scanner;

public class LibraryManagementDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryService service = new LibraryService();
		boolean running = true;

		while (running) {
			System.out.println("\n===== Library Management =====");
			System.out.println("1. Borrow Book");
			System.out.println("2. Return Book");
			System.out.println("3. Search Books");
			System.out.println("4. Exit");

			System.out.print("Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> service.borrowBook();
			case 2 -> service.returnBook();
			case 3 -> service.searchBooks();
			case 4 -> running = false;
			default -> System.out.println("Invalid choice!");
			}
		}

		sc.close();
	}
}
