package com.sorting.robowarehouse;

public class Package {
	// package attributes
	private int weight;

	// Constructor to initialize package
	public Package(int weight) {
		this.weight = weight;
	}

	// getter method for weight
	public int getWeight() {
		return weight;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Package Weight :"+weight;
	}
}
