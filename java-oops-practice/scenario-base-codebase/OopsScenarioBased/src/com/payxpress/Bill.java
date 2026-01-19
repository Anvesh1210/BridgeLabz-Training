package com.payxpress;

import java.time.*;

//abstract base class for bills
public abstract class Bill implements IPayable {
	// attributes for Bill
	protected String type;
	protected double amount;
	protected LocalDate dueDate;
	private boolean isPaid;
	protected String paymentLog;

	// constructor for bill creation
	public Bill(String type, double amount, LocalDate dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
		this.paymentLog = "Not Paid";
	}

	// method for checking payment status
	public boolean isPaid() {
		return isPaid;
	}

	// method for updating payment internally
	protected void markPaid() {
		isPaid = true;
		paymentLog = "Paid on " + LocalDate.now();
	}

	// method for calculating late fee
	protected double calculateLateFee(double penalty) {
		return amount + penalty;
	}
}
