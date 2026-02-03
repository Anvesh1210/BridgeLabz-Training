package com.methodreferences.invoiceobjectcreation;

//class representing a Invoice
public class Invoice {
	//invoice attributes
	String transactionId;

	//constructor to initialize invoice 
	Invoice(String transactionId) {
		this.transactionId = transactionId;
	}

	//overriding toString() method to print Invoice obj
	@Override
	public String toString() {
		return "Invoice generated for Transaction ID: " + transactionId;
	}
}