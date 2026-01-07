package com.eventeaseapplication;

//interface for scheduling related actions
public interface ISchedulable {
	 //method to schedule an event
	 void schedule();
	
	 //method to reschedule an event
	 void reschedule(String newDate);
	
	 //method to cancel an event
	 void cancel();
}

