package com.parkeaseapplication;

//class to represent a vehicle
public abstract class Vehicle implements IPayable {
	//vehicle attributes
    protected String vehicleNumber;
    protected double baseRate;

    //constructor to initialize vehicle attributes
    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    //getter method to get vehicle number
    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
