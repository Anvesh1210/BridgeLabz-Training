package com.trafficmanager;

public class TrafficManagerDriver {
	public static void main(String[] args) {

		// Create roundabout with capacity 3
		TrafficManager manager = new TrafficManager(3);

		// Vehicles arriving
		manager.vehicleArrives(new Vehicle("MH12-101"));
		manager.vehicleArrives(new Vehicle("MP04-202"));
		manager.vehicleArrives(new Vehicle("DL09-303"));
		manager.vehicleArrives(new Vehicle("KA01-404")); 

		// Print current state
		manager.printRoundaboutState();

		// Vehicles exiting
		manager.vehicleExits();
		manager.printRoundaboutState();

		manager.vehicleExits();
		manager.vehicleExits();
		manager.vehicleExits(); // underflow case
	}
}
