package com.sorting.smartshelf;

//class representing a book
public class Book {
	//book attribute
	private String title;
	
	//constructor to initialize book
	public Book(String title) {
		this.title = title;
	}

	//getter and setter method for title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
}
