package com.polymorphismandencapsulation.vehiclerentalsystem;

//abstract class representing a generic vehicle
public abstract class Vehicle {

	//protected so subclasses can access if needed
	protected String vehicleNumber;
	protected String type;

	//sensitive data should be encapsulated
	private double rentalRate; // rate per day

	//constructor to initialize vehicle details
	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}

	//getter to safely access rental rate
	public double getRentalRate() {
		return rentalRate;
	}

	//setter to update rental rate securely
	public void setRentalRate(double rentalRate) {
		if (rentalRate > 0) {
			this.rentalRate = rentalRate;
		}
	}

 	//abstract method for rental cost calculation
	public abstract double calculateRentalCost(int days);
}

