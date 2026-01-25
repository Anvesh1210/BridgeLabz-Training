package com.sorting.smartlibrary;

//class to represent smart library
public class SmartLibrary {
	// method for sorting books
	public void insertionSort(Book[] books) {
		for (int i = 1; i < books.length; i++) {
			Book key = books[i];
			int j = i - 1;
			while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				books[j + 1] = books[j];
				j--;
			}
			books[j + 1] = key;
		}
	}

	// method for displaying borrowed books
	public void displayBooks(Book[] books) {
		for (Book b : books) {
			b.display();
		}
	}
}
