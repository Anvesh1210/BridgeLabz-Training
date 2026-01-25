package com.sorting.icecreamrush;

//class to represent ice cream
public class IceCream {
	// Ice Cream attributes
	private String flavorName;
	private int soldCount;

	// constructor to initializing ice cream
	public IceCream(String flavorName, int soldCount) {
		this.flavorName = flavorName;
		this.soldCount = soldCount;
	}

	// method to get sold count
	public int getSoldCount() {
		return soldCount;
	}

	// method to displaying ice cream
	public void display() {
		System.out.println("Flavor: " + flavorName + " | Sold: " + soldCount);
	}
}
