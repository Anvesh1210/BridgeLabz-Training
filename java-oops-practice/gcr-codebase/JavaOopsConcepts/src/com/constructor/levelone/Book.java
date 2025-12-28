package com.constructor.levelone;

//Book class to store book details
public class Book {
	
	//defining book attributes
	String title;
	String author;
	double price;
	
	//Parameterize Constructor for Book class
	public Book(String title, String author, double price) {
		System.out.println("Parameterized constructor called....");
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Default constructor for book class
	public Book() {
		System.out.println("Default constructor called....");
	}
	
	//Method to show Book details
	public void show() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
