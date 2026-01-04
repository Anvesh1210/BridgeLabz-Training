package com.polymorphismandencapsulation.librarymanagementsystem;

//abstract base class for all library items
public abstract class LibraryItem {

	//library attributes
	protected String itemId;
	protected String title;
	protected String author;

	private String borrowerName;
	private boolean isAvailable = true;

	//constructor to initialize attributes
	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	//concrete method
	public void getItemDetails() {
		System.out.println("Item ID   : " + itemId);
		System.out.println("Title     : " + title);
		System.out.println("Author    : " + author);
		System.out.println("Available : " + isAvailable);
	}

	//encapsulated methods for borrower details
	protected void setBorrower(String name) {
		this.borrowerName = name;
		this.isAvailable = false;
	}

	protected void releaseItem() {
		this.borrowerName = null;
		this.isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	//method to get Loan duration
	public abstract int getLoanDuration();
}
