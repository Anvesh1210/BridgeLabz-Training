package com.designprinciples.levelone;

//Book class to store book 
public class Book{
	//defining book attributes
	private String title;
	private String author;
	private double price;
	
	//default constructor
	public Book() {
		
	}
	
	//parameterized constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//getter and setter methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//method to display books
	public void displayBook() {
		System.out.println();
		System.out.println("Title  : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price  : "+price);
	}
	
}
