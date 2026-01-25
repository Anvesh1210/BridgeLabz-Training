package com.sorting.foodfest;

//class to reprsent food stall
public class Stall {
	// stall attributes
	private String stallName;
	private int footfall;

	// constructor to initialize stall
	public Stall(String stallName, int footfall) {
		this.stallName = stallName;
		this.footfall = footfall;
	}

	// method for displaying stall details
	public void display() {
		System.out.println("\nStall: " + stallName);
		System.out.println("Footfall: " + footfall);
	}

	// method for getting footfall
	public int getFootfall() {
		return footfall;
	}

}
