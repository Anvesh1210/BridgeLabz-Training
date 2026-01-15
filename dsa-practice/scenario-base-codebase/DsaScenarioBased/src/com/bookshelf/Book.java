package com.bookshelf;

//class to represent a book
public class Book {
	private String isbn;
	private String title;
	private String author;
	
	//constructor to initialize book attributes
	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	//getter methods for book class
	public String getIsbn() {
		return isbn;
	}

	public String getDetails() {
		return title + " by " + author + " (ISBN: " + isbn + ")";
	}
}
