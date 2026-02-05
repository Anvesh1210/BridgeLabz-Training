package com.streamapi.eventattendeewelcomemessage;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMessage {
	public static void main(String[] args) {
		List<String> attendees = Arrays.asList("Anvesh", "Ritika", "Rahul");
		attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
	}
}
