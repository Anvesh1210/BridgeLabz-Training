package com.vehiclerentalapplication;

//class to represent a customer
public class Customer {
	//customer fields
    private String name;

    //constructor to initialize name of the student
    public Customer(String name) {
        this.name = name;
    }

    //method to rent a vehicle
    public void rentVehicle(Rentable vehicle, int days) {
        System.out.println("Customer: " + name);
        System.out.println("Total Rent: ₹" + vehicle.calculateRent(days));
    }
}

