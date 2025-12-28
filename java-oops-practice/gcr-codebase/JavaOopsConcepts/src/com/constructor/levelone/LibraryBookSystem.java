package com.constructor.levelone;

public class LibraryBookSystem {
	String title;
	String author;
	double price;
	boolean availability;
	
	public LibraryBookSystem(String title, String author, double price, boolean availability) {
		System.out.println("Parameterized constructor called....");
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	public void borrowBook() {
	    if (availability) {
	       	availability = false;
	        System.out.println("You have successfully borrowed: " + title);
	    } else {
	        System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
	    }
    }

}
