package com.parkeaseapplication;

//class to represent a Car
public class Car extends Vehicle {

	//constructor to initialize car
    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // ₹50/hour
    }

    //method to calculate car charges according to 
    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 5 ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}

