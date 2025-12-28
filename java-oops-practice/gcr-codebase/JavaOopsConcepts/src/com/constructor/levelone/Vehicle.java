package com.constructor.levelone;

public class Vehicle {
	//creating instance variables
    private String ownerName;
    private String vehicleType;

    //creating class variable
    private static double registrationFee = 1500.0;

    //creating parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    //method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
        
    }

    //method to update registration fees
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
