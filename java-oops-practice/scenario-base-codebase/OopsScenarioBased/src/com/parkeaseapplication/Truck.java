package com.parkeaseapplication;

//method to represent a Truck
public class Truck extends Vehicle {

	//Truck constructor to initialize Truck
    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100); // ₹100/hour
    }

    //method to calculate charges
    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 4 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
