package com.constructor.levelone;

//classs to use Book class
public class BookDriver {
	public static void main(String[] args) {
		//creating book object with default constructor
		Book book1 = new Book();
		
		//creating Book object with Parameterized constructor
		Book book2 = new Book("Java: The Complete Reference","Herbert Schildt",1000);
		
		//calling show() method
		book2.show();
	}
}
