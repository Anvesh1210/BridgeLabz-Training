package com.sorting.smartshelf;

import java.util.ArrayList;
import java.util.List;

//class representing a Library
public class Library {

	// library attributes
	private String name;
	private List<Book> readingList;

	// constructor to initialize library
	public Library(String name) {
		this.name = name;
		readingList = new ArrayList<>();
	}
	
	//method to add book in the reading list
	public void addBook(Book book) {
		readingList.add(book);
		int j=readingList.size()-1;
		while(j > 0 && readingList.get(j).getTitle().compareToIgnoreCase(readingList.get(j - 1).getTitle()) < 0) {
			Book temp = readingList.get(j);
			readingList.set(j, readingList.get(j-1));
			readingList.set(j-1,temp);
			j--;
		}
	}

	//method to print all books
	public void printAllBooks() {
		for(Book book : readingList) {
			System.out.println(book);
		}
	}
}
