package com.polymorphismandencapsulation.librarymanagementsystem;

//interface defining reservation-related behavior
public interface Reservable {

	//reserve the library item
	void reserveItem();

	//check if item is available
	boolean checkAvailability();
}

