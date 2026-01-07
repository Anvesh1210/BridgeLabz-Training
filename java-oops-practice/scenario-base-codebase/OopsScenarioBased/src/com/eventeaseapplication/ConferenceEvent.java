package com.eventeaseapplication;

//conferenceEvent is another type of Event
public class ConferenceEvent extends Event {
	 //constructor without additional services
	 public ConferenceEvent(String eventId, String eventName, String location,
	                        String date, int attendees, double venueCost) {
	
	     super(eventId, eventName, location, date, attendees, venueCost);
	 }
	
	 //custom scheduling behavior for conferences
	 @Override
	 public void schedule() {
	     System.out.println("Conference scheduled with professional setup");
	 }
	
	 //reschedule conference
	 @Override
	 public void reschedule(String newDate) {
	     this.date = newDate;
	     System.out.println("Conference rescheduled to " + newDate);
	 }
	
	 //cancel conference
	 @Override
	 public void cancel() {
	     System.out.println("Conference event cancelled");
	 }
}

