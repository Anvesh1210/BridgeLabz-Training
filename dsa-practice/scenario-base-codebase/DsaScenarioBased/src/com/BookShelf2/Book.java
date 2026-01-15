package com.BookShelf2;

//This class represents a Book
public class Book {

	private String bookId;
	private String title;
	private String author;

	// Constructor
	public Book(String bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// Getter methods
	public String getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Override equals to avoid duplicate books
	@Override
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		return this.bookId.equals(b.bookId);
	}

	// Override hashCode
	@Override
	public int hashCode() {
		return bookId.hashCode();
	}

	// Display book details
	public void display() {
		System.out.println(bookId + " | " + title + " | " + author);
	}
}
