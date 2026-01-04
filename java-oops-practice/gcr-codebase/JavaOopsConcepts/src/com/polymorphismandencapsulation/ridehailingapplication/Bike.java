package com.polymorphismandencapsulation.ridehailingapplication;

//class to represent a bike
public class Bike extends Vehicle implements GPS {
	private String currentLocation = "Not Updated";

	public Bike(String id, String driver, double rate) {
		super(id, driver, rate);
	}

	//bike has lower fare
	@Override
	public double calculateFare(double distance) {
		return distance * getRatePerKm();
	}

	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}

	@Override
	public void updateLocation(String newLocation) {
		this.currentLocation = newLocation;
	}
}

