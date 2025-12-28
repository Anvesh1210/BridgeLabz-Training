package com.constructor.levelone;

public class LibraryBookSystemDriver {
	public static void main(String[] args) {
		//creating object with parameterized constructor
		LibraryBookSystem book1 = new LibraryBookSystem("Java: The Complete Reference","Herbert Schildt",1000,true);
		//calling boorowBook() method
		book1.borrowBook();
		
		//creating object with parameterized constructor
		LibraryBookSystem book2 = new LibraryBookSystem("Java: The Complete Reference","Herbert Schildt",1000,false);
		//calling boorowBook() method
		book2.borrowBook();
	}
}
