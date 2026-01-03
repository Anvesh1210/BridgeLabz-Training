package com.vehiclerentalapplication;

//class to represent a Truck
public class Truck extends Vehicle implements Rentable {

	//constructor to initialize Truck no and base rate
    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1500);
    }

    //overridden method to calculate rent according to days
    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (200 * days); // load surcharge
    }
}
