package com.eventeaseapplication;

//BirthdayEvent is a specific type of Event
public class BirthdayEvent extends Event {
	 //constructor with services
	 public BirthdayEvent(String eventId, String eventName, String location,String date, int attendees, double venueCost,double serviceCost, double discount) {
	     super(eventId, eventName, location, date, attendees,venueCost, serviceCost, discount);
	 }
	
	 //custom scheduling behavior for birthday events
	 @Override
	 public void schedule() {
	     System.out.println("Birthday event scheduled with decorations and music");
	 }
	
	 //reschedule birthday event
	 @Override
	 public void reschedule(String newDate) {
	     this.date = newDate;
	     System.out.println("Birthday event rescheduled to " + newDate);
	 }
	
	 //cancel birthday event
	 @Override
	 public void cancel() {
	     System.out.println("Birthday event cancelled");
	 }
}
