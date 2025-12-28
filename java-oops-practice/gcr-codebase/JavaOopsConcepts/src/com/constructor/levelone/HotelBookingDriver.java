package com.constructor.levelone;

//Driver class to use HotelBooking class
public class HotelBookingDriver {
	public static void main(String[] args) {
		//creating object with default constructor 
		HotelBooking hotel = new HotelBooking();
		
		//creating object with parameterize constructor and call show() method
		HotelBooking hotel1 = new HotelBooking("Anvesh","Double",1);
		hotel1.show();
		
		//creating object with copy constructor and call show() method
		HotelBooking hotel2 = new HotelBooking(hotel1);
		hotel2.show();
	}
}
