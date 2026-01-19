package com.budgetwise;

import java.time.*;

//class for storing transaction details
public class Transaction {
	// attributes for Transaction
	private double amount;
	private String type;
	private LocalDate date;
	private String category;

	// constructor for transaction
	public Transaction(double amount, String type, LocalDate date, String category) {
		this.amount = amount;
		this.type = type;
		this.date = date;
		this.category = category;
	}

	// method for getting amount
	public double getAmount() {
		return amount;
	}

	// method for getting type
	public String getType() {
		return type;
	}

	// method for getting category
	public String getCategory() {
		return category;
	}
}
