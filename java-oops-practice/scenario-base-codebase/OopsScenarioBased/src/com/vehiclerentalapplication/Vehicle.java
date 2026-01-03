package com.vehiclerentalapplication;

//class to represent a Vehicle
public class Vehicle {
	
	//Vehicle attributes
	protected String vehicleNumber;
    protected double baseRate;

    //constructor to initialize vehicle number and base rate
    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    //getter methods to get vehicle information
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
