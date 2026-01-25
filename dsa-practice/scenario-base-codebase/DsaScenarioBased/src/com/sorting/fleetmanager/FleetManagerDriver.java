package com.sorting.fleetmanager;

//class to use Fleet Manager
public class FleetManagerDriver {
	public static void main(String[] args) {
		//creating vehicles
		Vehicle[] vehicles = { new Vehicle("DL01", 12000), new Vehicle("DL02", 18000), new Vehicle("MH01", 15000),
				new Vehicle("MH02", 22000), new Vehicle("KA01", 10000), new Vehicle("KA02", 20000) };

		//creating fleet manager
		FleetManager manager = new FleetManager();
		System.out.println("Vehicle List Before Sorting:");
		manager.displayVehicles(vehicles);
		manager.mergeSort(vehicles);
		System.out.println("\nVehicle List After Sorting (By Mileage):");
		manager.displayVehicles(vehicles);
	}
}
