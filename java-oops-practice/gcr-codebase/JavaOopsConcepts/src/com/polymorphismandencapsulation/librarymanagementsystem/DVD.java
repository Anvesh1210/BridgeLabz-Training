package com.polymorphismandencapsulation.librarymanagementsystem;

//DVD class
public class DVD extends LibraryItem implements Reservable {

	public DVD(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	//DVDs can be issued for 3 days
	@Override
	public int getLoanDuration() {
		return 3;
	}

	@Override
	public void reserveItem() {
		if (isAvailable()) {
			setBorrower("Reserved User");
			System.out.println("DVD reserved successfully.");
		} else {
			System.out.println("DVD is already reserved.");
		}
	}
	
	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}
