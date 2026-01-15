package com.BookShelf2;

public class BookShelfDriver {
	public static void main(String[] args) {

		BookShelf shelf = new BookShelf();

		// Add books
		shelf.addBook("Fiction", new Book("B101", "1984", "George Orwell"));
		shelf.addBook("Fiction", new Book("B102", "Animal Farm", "George Orwell"));
		shelf.addBook("Science", new Book("B201", "Brief History of Time", "Stephen Hawking"));

		// Duplicate book test
		shelf.addBook("Fiction", new Book("B101", "1984", "George Orwell"));

		// Display books
		shelf.displayBooks();

		// Remove book (borrowed)
		shelf.removeBook("Fiction", "B102");

		// Display again
		shelf.displayBooks();
	}
}
