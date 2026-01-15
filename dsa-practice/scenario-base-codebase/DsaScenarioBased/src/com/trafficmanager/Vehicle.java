package com.trafficmanager;

//This class represents a vehicle
public class Vehicle {

	private String vehicleNumber; // stores vehicle number
	private Vehicle next; // points to next vehicle

	// Constructor to initialize vehicle
	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		this.next = null;
	}

	// Getter for vehicle number
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	// Getter for next vehicle
	public Vehicle getNext() {
		return next;
	}

	// Setter for next vehicle
	public void setNext(Vehicle next) {
		this.next = next;
	}

	// Display vehicle details
	public void display() {
		System.out.println("Vehicle Number: " + vehicleNumber);
	}
}
