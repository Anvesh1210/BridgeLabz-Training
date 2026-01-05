package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//class to represent a book node
public class BookNode {
	
	//book attributes
	int bookId;
	String title;
	String author;
	String genre;
	boolean available;
	BookNode prev, next;

	//constructor to initialize book attributes
	BookNode(int bookId, String title, String author, String genre, boolean available) {
	    this.bookId = bookId;
	    this.title = title;
	    this.author = author;
	    this.genre = genre;
	    this.available = available;
	    this.prev = null;
	    this.next = null;
	}
}
