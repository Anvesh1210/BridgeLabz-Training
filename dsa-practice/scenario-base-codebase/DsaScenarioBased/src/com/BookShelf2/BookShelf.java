package com.BookShelf2;

import java.util.*;

// This class manages library books
public class BookShelf {

	// HashMap stores genre and list of books
	private HashMap<String, LinkedList<Book>> genreMap;

	// HashSet to avoid duplicate books
	private HashSet<Book> bookSet;

	// Constructor
	public BookShelf() {
		genreMap = new HashMap<>();
		bookSet = new HashSet<>();
	}

	// Add book to library
	public void addBook(String genre, Book book) {

		// Check duplicate book
		if (!bookSet.add(book)) {
			System.out.println("Duplicate book not allowed: " + book.getTitle());
			return;
		}

		// If genre not present, create new list
		genreMap.putIfAbsent(genre, new LinkedList<>());

		// Add book to genre list
		genreMap.get(genre).add(book);

		System.out.println("Book added: " + book.getTitle());
	}

	// Remove book (borrowed)
	public void removeBook(String genre, String bookId) {

		LinkedList<Book> list = genreMap.get(genre);

		if (list == null) {
			System.out.println("Genre not found.");
			return;
		}

		Iterator<Book> itr = list.iterator();

		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.getBookId().equals(bookId)) {
				itr.remove();
				bookSet.remove(b);
				System.out.println("Book removed: " + b.getTitle());
				return;
			}
		}

		System.out.println("Book not found.");
	}

	// Display books genre wise
	public void displayBooks() {

		if (genreMap.isEmpty()) {
			System.out.println("Library is empty.");
			return;
		}

		for (String genre : genreMap.keySet()) {
			System.out.println("\nGenre: " + genre);

			LinkedList<Book> list = genreMap.get(genre);
			for (Book book : list) {
				book.display();
			}
		}
	}
}
