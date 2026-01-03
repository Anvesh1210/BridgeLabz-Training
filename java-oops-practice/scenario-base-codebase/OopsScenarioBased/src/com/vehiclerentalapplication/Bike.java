package com.vehiclerentalapplication;

//class to represent a Bike
public class Bike extends Vehicle implements Rentable {

	//constructor to initialize bike no and base rate
    public Bike(String vehicleNumber) {
        super(vehicleNumber, 300);
    }

    //overridden method to calculate rent according to days
    @Override
    public double calculateRent(int days) {
        return baseRate * days; // no surcharge
    }
}
