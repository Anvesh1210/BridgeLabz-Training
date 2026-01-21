package com.sorting.smartshelf;

//class to use Library
public class LibraryDriver {
	public static void main(String[] args) {
		//creating library and books
		Library l1 = new Library("Boundless Books");
		Book book1 = new Book("Java");
		Book book2 = new Book("Python");
		Book book3 = new Book("CPP");
		Book book4 = new Book("C programming");
		l1.addBook(book1);
		l1.addBook(book2);
		l1.addBook(book3);
		l1.addBook(book4);
		l1.printAllBooks();
	}
}
