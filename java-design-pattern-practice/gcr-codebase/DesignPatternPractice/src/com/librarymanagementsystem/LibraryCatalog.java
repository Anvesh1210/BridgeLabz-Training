package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

	private static volatile LibraryCatalog instance;

	private final List<Book> books;
	private final List<Observer> observers;

	private LibraryCatalog() {
		books = new ArrayList<>();
		observers = new ArrayList<>();
	}

	public static LibraryCatalog getInstance() {
		if (instance == null) {
			synchronized (LibraryCatalog.class) {
				if (instance == null) {
					instance = new LibraryCatalog();
				}
			}
		}
		return instance;
	}

	public void addBook(Book book) {
		books.add(book);
		notifyObservers(book.getTitle());
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	private void notifyObservers(String bookName) {
		for (Observer observer : observers) {
			observer.update("New book available: " + bookName);
		}
	}
}
