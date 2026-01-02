package com.inheritance.levelone;

//class to use Vehicle
public class VehicleDriver {
	public static void main(String[] args) {
		//Vehicle array
        Vehicle[] vehicles = new Vehicle[3];

        //creating vehicle objects and store it in array
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        System.out.println("---- Vehicle Details ----\n");

        //displaying details
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
