package com.tourmateapplication;

//Base Trip class
public abstract class Trip implements IBookable {
	//Trip attributes
	protected String destination;
	protected int duration;
	protected double totalBudget;
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;
	
	// Constructor to create full trip package
	public Trip(String destination, int duration,Transport transport, Hotel hotel, Activity activity) {
	
	    this.destination = destination;
	    this.duration = duration;
	    this.transport = transport;
	    this.hotel = hotel;
	    this.activity = activity;
	
	    // Operator usage: total budget calculation
	    this.totalBudget = transport.getCost()
	                      + hotel.getCost()
	                      + activity.getCost();
	}
	
	// Common method to show trip details
	public void showTripDetails() {
	    System.out.println("Destination: " + destination);
	    System.out.println("Duration: " + duration + " days");
	    System.out.println("Total Budget: ₹" + totalBudget);
	}
}

