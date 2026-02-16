package com.advancedfeatures;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private String category;
	private int totalCopies;
	private int availableCopies;

	public Book(int bookId, String title, String author, String category, int totalCopies, int availableCopies) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}

	@Override
	public String toString() {
		return bookId + " | " + title + " | " + author + " | " + category + " | Available: " + availableCopies;
	}
}
