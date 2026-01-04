package com.polymorphismandencapsulation.ridehailingapplication;

//class to represent a car
public class Car extends Vehicle implements GPS {
	private String currentLocation = "Not Updated";

	public Car(String id, String driver, double rate) {
		super(id, driver, rate);
	}

	//fare = distance * rate
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

