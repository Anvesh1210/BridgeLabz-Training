package com.constructor.levelone;

public class VehicleDriver {
	public static void main(String[] args) {
		//creating vehicle objects
		Vehicle v1 = new Vehicle("Anvesh", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        //displaying details
        System.out.println("Before updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);
        
        //after update displaying details
        System.out.println("\nAfter updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
