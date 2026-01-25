package com.sorting.fleetmanager;

//class to represent a vehicle
public class Vehicle {
	// Vehicle attributes
	private String vehicleId;
	private int mileage;

	// constructor to initializing vehicle details
	public Vehicle(String vehicleId, int mileage) {
		this.vehicleId = vehicleId;
		this.mileage = mileage;
	}

	// method to get mileage
	public int getMileage() {
		return mileage;
	}

	// method to displaying vehicle details
	public void display() {
		System.out.println("Vehicle ID: " + vehicleId + ", Mileage: " + mileage);
	}
}
