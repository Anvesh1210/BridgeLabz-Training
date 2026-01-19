package com.payxpress;

import java.time.*;

//class for internet bill
public class InternetBill extends Bill {

	// constructor for internet bill
	public InternetBill(double amount, LocalDate dueDate) {
		super("Internet", amount, dueDate);
	}

	// method for paying internet bill
	public void pay(double penalty) {
		double total = calculateLateFee(penalty);
		markPaid();
		System.out.println("Internet bill paid. Total: ₹" + total);
	}

	// method for sending internet reminder
	public void sendReminder() {
		System.out.println("Reminder: Internet will disconnect after " + dueDate);
	}
}
