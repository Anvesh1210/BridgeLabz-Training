package com.streamapi.emailnotifications;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList("user1@gmail.com", "user2@gmail.com", "user3@gmail.com");
		emails.forEach(email -> System.out.println("Notification sent to: " + email));
	}
}
