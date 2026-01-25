package com.sorting.smartlibrary;

//class to represent a book
public class Book {
	// book attributes
	private String title;

	// constructor to initializing book title
	public Book(String title) {
		this.title = title;
	}

	// method to get book title
	public String getTitle() {
		return title;
	}

	// method to display book details
	public void display() {
		System.out.println("Book Title: " + title);
	}
}
