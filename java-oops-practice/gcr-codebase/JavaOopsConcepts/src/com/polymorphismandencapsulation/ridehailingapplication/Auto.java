package com.polymorphismandencapsulation.ridehailingapplication;

//class to represent a vehicle
public class Auto extends Vehicle implements GPS {
	private String currentLocation = "Not Updated";

	public Auto(String id, String driver, double rate) {
		super(id, driver, rate);
	}

	//auto fare includes base charge
	@Override
	public double calculateFare(double distance) {
		return (distance * getRatePerKm()) + 20;
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
