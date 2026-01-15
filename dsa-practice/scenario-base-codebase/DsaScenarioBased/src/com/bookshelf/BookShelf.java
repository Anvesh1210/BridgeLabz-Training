package com.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

//class to represent Book Shelf
public class BookShelf {
	private Map<String, LinkedList<Book>> catalog;
	private Set<String> isbnSet; // HashSet for duplication control

	public BookShelf() {
		catalog = new HashMap<>();
		isbnSet = new HashSet<>();
	}

	//method to add book in shelf
	public void addBook(String genre, Book book) {
		//duplicate check using HashSet
		if (isbnSet.contains(book.getIsbn())) {
			System.out.println("Duplicate book not allowed.");
			return;
		}
		catalog.putIfAbsent(genre, new LinkedList<>());
		catalog.get(genre).add(book);
		isbnSet.add(book.getIsbn());
		System.out.println("Book added to " + genre);
	}

	//method to borrow book from shelf
	public void borrowBook(String genre, String isbn) {
		LinkedList<Book> books = catalog.get(genre);
		if (books == null) {
			System.out.println("Genre not found.");
			return;
		}

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getIsbn().equals(isbn)) {
				System.out.println("Book borrowed: " + books.get(i).getDetails());
				books.remove(i);
				isbnSet.remove(isbn);
				return;
			}
		}

		System.out.println("Book not found.");
	}

	//method to display catalog
	public void displayCatalog() {
		for (String genre : catalog.keySet()) {
			System.out.println("\nGenre: " + genre);
			for (Book book : catalog.get(genre)) {
				System.out.println("  " + book.getDetails());
			}
		}
	}
}
