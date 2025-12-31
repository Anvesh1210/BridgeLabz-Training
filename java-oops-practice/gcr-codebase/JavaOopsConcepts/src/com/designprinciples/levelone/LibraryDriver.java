package com.designprinciples.levelone;

//driver class to use Library and Book class
public class LibraryDriver {
	public static void main(String[] args) {
		//creating Library objects
		Library centraLibrary = new Library("Central Library");
		Library cityLibrary = new Library("City Library");
		
		//creating book object
		Book book1 = new Book("Hansen And Crystal", "Crystal Dwyer",2500);
		Book book2 = new Book("Java Programming", "Ananya Shukla",500);
		Book book3 = new Book("C++ Programming", "Anvesh", 250);
		
		//calling add book method
		centraLibrary.addBook(book1);
		centraLibrary.addBook(book2);
		cityLibrary.addBook(book3);
		
		//displaying all books
		centraLibrary.displayAllBooks();
		cityLibrary.displayAllBooks();
	}
}
