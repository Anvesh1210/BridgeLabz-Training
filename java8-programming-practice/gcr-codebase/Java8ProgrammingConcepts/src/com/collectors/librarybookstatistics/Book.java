package com.collectors.librarybookstatistics;

//class representing a book 
public class Book {
	private String name;
	private String genre;
	private int noOfPages;

	//constructor to initialize book
	public Book(String name, String genre, int noOfPages) {
		this.name = name;
		this.genre = genre;
		this.noOfPages = noOfPages;
	}

	//getter methods of book
	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	//overriding toString() method for book
	@Override
	public String toString() {
		return "Book [name=" + name + ", genre=" + genre + ", noOfPages=" + noOfPages + "]";
	}

}
