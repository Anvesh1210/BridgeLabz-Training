package com.sorting.zipzipmart;

//class to represent a Transaction
public class Transaction {
	
	//transaction attributes
	String date;
	double amount;
	
	//constructor to initialize transaction
	public Transaction(String date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	//overriden toString() method
	@Override
	public String toString() {
		return date + " - ₹" + amount;
	}
}
