package com.constructor.levelone;

//class to show hotel booking details
public class HotelBooking {
	
	//Attributes of Hotel Booking System
	String guestName;
	String roomType;
	int nights;
	
	//default constructor
	public HotelBooking() {
		System.out.println("Default constructor called....");
	}

	//parameterize constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		System.out.println("Parameterized constructor called....");
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}

	//copy constructor
	public HotelBooking(HotelBooking hotelBooking) {
		System.out.println("copy constructor called....");
		this.guestName = hotelBooking.guestName;
		this.roomType = hotelBooking.roomType;
		this.nights = hotelBooking.nights;
	}
	
	//show method to show details
	public void show() {
		System.out.println("Guest Name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("Nights: "+nights);
	}
}
