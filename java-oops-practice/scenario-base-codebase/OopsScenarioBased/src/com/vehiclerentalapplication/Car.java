package com.vehiclerentalapplication;

//class to represent a car
public class Car extends Vehicle implements Rentable {

	//constructor to initialize car no and base rate
    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

  //overridden method to calculate rent according to days
    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        if (days > 5) {
            rent += 500; // long duration surcharge
        }
        return rent;
    }
}