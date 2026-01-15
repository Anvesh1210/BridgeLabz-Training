package com.bookshelf;

//Driver class for book shelf
public class BookShelfDriver {
	public static void main(String[] args) {

		//creating book shelf object
		BookShelf shelf = new BookShelf();

		//creating Book objects
		Book b1 = new Book("101", "Clean Code", "Robert Martin");
		Book b2 = new Book("102", "Effective Java", "Joshua Bloch");
		Book b3 = new Book("102", "Effective Java", "Joshua Bloch");

		//adding books to shelf
		shelf.addBook("Programming", b1);
		shelf.addBook("Programming", b2);
		shelf.addBook("Programming", b3);

		//displaying catalog and borrowing book
		shelf.displayCatalog();
		shelf.borrowBook("Programming", "101");
		shelf.displayCatalog();
	}
}
