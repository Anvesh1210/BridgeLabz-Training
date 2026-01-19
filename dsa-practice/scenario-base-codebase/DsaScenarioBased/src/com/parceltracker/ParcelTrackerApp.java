package com.parceltracker;

//main class for parcel tracking execution
public class ParcelTrackerApp {

	// method for main execution
	public static void main(String[] args) {

		ParcelChain chain = new ParcelChain();

		chain.addStage("Packed");
		chain.addStage("Shipped");
		chain.addStage("In Transit");
		chain.addStage("Delivered");

		System.out.println("Initial Parcel Flow:");
		chain.trackParcel();

		chain.insertAfter("Shipped", "Warehouse Checkpoint");

		System.out.println("After Adding Custom Checkpoint:");
		chain.trackParcel();

		chain.detectLoss();
	}
}
