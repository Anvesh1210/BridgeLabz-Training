package com.designprinciples.levelone;

import java.util.ArrayList;

//Library class to store books
public class Library {
	//library attributes
	private String libraryName;
	private ArrayList<Book> libraryBooks;
	
	//parameterized constructor to initialize library name
	public Library(String libraryName) {
		this.libraryName = libraryName;
		libraryBooks = new ArrayList<>();
	}
	
	//addBook method
	public void addBook(Book book) {
		libraryBooks.add(book);
	}

	//display all book method
	public void displayAllBooks() {
		System.out.println("\nBooks in library "+libraryName+" :");
		for(Book book : libraryBooks) {
			book.displayBook();
		}
	}
	
}
