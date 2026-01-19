package com.payxpress;

import java.time.*;

//class for electricity bill
public class ElectricityBill extends Bill {

	// constructor for electricity bill
	public ElectricityBill(double amount, LocalDate dueDate) {
		super("Electricity", amount, dueDate);
	}

	// method for paying electricity bill
	public void pay(double penalty) {
		double total = calculateLateFee(penalty);
		markPaid();
		System.out.println("Electricity bill paid. Total: ₹" + total);
	}

	// method for sending electricity reminder
	public void sendReminder() {
		System.out.println("Reminder: Electricity bill due on " + dueDate);
	}
}
