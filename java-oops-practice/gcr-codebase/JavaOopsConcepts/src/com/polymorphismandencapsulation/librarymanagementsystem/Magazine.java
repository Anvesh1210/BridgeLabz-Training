package com.polymorphismandencapsulation.librarymanagementsystem;

//magazine class
public class Magazine extends LibraryItem implements Reservable {

	public Magazine(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	//magazines can be issued for 7 days
	@Override
	public int getLoanDuration() {
		return 7;
	}

	@Override
	public void reserveItem() {
		if (isAvailable()) {
			setBorrower("Reserved User");
			System.out.println("Magazine reserved successfully.");
		} else {
			System.out.println("Magazine is already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}
