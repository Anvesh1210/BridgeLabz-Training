package com.tourmateapplication;

//International trip class
public class InternationalTrip extends Trip {
	
	 public InternationalTrip(String destination, int duration,Transport transport, Hotel hotel, Activity activity) {
	     super(destination, duration, transport, hotel, activity);
	 }
	
	 //international booking logic
	 @Override
	 public void book() {
	     System.out.println("International trip booked with passport & visa check.");
	 }
	
	 @Override
	 public void cancel() {
	     System.out.println("International trip booking cancelled.");
	 }
}

