package com.payxpress;

import java.time.*;

//class for water bill
public class WaterBill extends Bill {

	// constructor for water bill
	public WaterBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate);
	}

	// method for paying water bill
	public void pay(double penalty) {
		double total = calculateLateFee(penalty);
		markPaid();
		System.out.println("Water bill paid. Total: ₹" + total);
	}

	// method for sending water reminder
	public void sendReminder() {
		System.out.println("Reminder: Water supply bill pending. Due: " + dueDate);
	}
}
