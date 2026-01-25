package com.sorting.smartlibrary;

//class to use smart library
public class SmartLibraryDriver {
	public static void main(String[] args) {
		// creating multiple books
		Book[] borrowedBooks = { new Book("Algorithms"), new Book("Data Structures"), new Book("Java Programming"),
				new Book("Operating Systems"), new Book("Computer Networks") };

		// creating Smart Library
		SmartLibrary manager = new SmartLibrary();
		System.out.println("Borrowed Books Before Sorting:");
		manager.displayBooks(borrowedBooks);
		manager.insertionSort(borrowedBooks);
		System.out.println("\nBorrowed Books After Sorting (Alphabetical Order):");
		manager.displayBooks(borrowedBooks);
	}
}
