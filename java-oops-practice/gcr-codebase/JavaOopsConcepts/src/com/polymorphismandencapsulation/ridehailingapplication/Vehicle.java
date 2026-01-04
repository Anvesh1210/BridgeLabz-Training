package com.polymorphismandencapsulation.ridehailingapplication;

//abstract base class for all vehicles
public abstract class Vehicle {

	//vehicle attributes
	protected String vehicleId;
	protected String driverName;

	private double ratePerKm;

	//constructor
	public Vehicle(String vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}

	//getter for rate	
	protected double getRatePerKm() {
		return ratePerKm;
	}

	//concrete method common to all vehicles
	public void getVehicleDetails() {
		System.out.println("Vehicle ID  : " + vehicleId);
		System.out.println("Driver Name : " + driverName);
		System.out.println("Rate / Km   : " + ratePerKm);
	}

	//abstract method for fare calculation
	public abstract double calculateFare(double distance);
}

