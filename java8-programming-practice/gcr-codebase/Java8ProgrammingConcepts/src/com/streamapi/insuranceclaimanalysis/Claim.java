package com.streamapi.insuranceclaimanalysis;

//class representing Claim
public class Claim {
	//claim attributes
	private String type;
	private double amount;

	//constructor
	public Claim(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	//getter methods
	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
}
