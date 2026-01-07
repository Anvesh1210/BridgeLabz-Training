package com.eventeaseapplication;

//abstract base class for all events
abstract class Event implements ISchedulable {
	 // Event ID should not be changed once assigned
	 private final String eventId;
	
	 //common event details
	 protected String eventName;
	 protected String location;
	 protected String date;
	 protected int attendees;
	
	 //pricing details
	 private double venueCost;
	 private double serviceCost;
	 private double discount;
	
	 //constructor without catering/decoration services
	 public Event(String eventId, String eventName, String location,
	              String date, int attendees, double venueCost) {
	
	     this.eventId = eventId;
	     this.eventName = eventName;
	     this.location = location;
	     this.date = date;
	     this.attendees = attendees;
	     this.venueCost = venueCost;
	     this.serviceCost = 0;
	     this.discount = 0;
	 }
	
	 //constructor with catering/decoration services
	 public Event(String eventId, String eventName, String location,
	              String date, int attendees, double venueCost,
	              double serviceCost, double discount) {
	
	     this.eventId = eventId;
	     this.eventName = eventName;
	     this.location = location;
	     this.date = date;
	     this.attendees = attendees;
	     this.venueCost = venueCost;
	     this.serviceCost = serviceCost;
	     this.discount = discount;
	 }
	
	 //calculate total event cost using operators
	 public double calculateTotalCost() {
	     return venueCost + serviceCost - discount;
	 }
	
	 //display event details
	 public void displayEvent() {
	     System.out.println("\nEvent ID: " + eventId);
	     System.out.println("Event Name: " + eventName);
	     System.out.println("Location: " + location);
	     System.out.println("Date: " + date);
	     System.out.println("Attendees: " + attendees);
	     System.out.println("Total Cost: " + calculateTotalCost());
	 }
}

