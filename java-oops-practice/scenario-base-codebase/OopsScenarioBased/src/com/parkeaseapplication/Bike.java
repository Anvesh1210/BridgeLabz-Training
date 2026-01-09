package com.parkeaseapplication;

//class to represent a Bike
public class Bike extends Vehicle {

	//Constructor to initialize Bike
    public Bike(String vehicleNumber) {
        super(vehicleNumber, 30); // ₹30/hour
    }

    //method to calculate charges
    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 6 ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
