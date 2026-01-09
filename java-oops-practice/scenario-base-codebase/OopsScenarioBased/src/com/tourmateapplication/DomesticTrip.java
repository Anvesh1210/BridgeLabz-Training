package com.tourmateapplication;

//Domestic trip class
public class DomesticTrip extends Trip {
	 public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
	     super(destination, duration, transport, hotel, activity);
	 }
	
	 //domestic booking logic
	 @Override
	 public void book() {
	     System.out.println("Domestic trip booked successfully.");
	 }
	
	 @Override
	 public void cancel() {
	     System.out.println("Domestic trip booking cancelled.");
	 }
}

