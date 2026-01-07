package com.eventeaseapplication;

//main class to run the EventEase application
public class EventEaseApp {
	 public static void main(String[] args) {
	     //create organizer
	     User organizer = new User("Anvesh", "anvesh@gmail.com");
	     organizer.displayUser();
	
	     //create a birthday event with services
	     Event birthday = new BirthdayEvent("EVT101","Anvesh Birthday","Bhopal","15-Aug-2026",50, 20000,8000,2000);
	
	     //create a conference event without services
	     Event conference = new ConferenceEvent(
	             "EVT102",
	             "Java Developers Conference",
	             "Indore",
	             "10-Sep-2026",
	             200,
	             50000
	     );
	
	   
	     birthday.schedule();
	     birthday.displayEvent();
	
	     conference.schedule();
	     conference.displayEvent();
	 }
}

