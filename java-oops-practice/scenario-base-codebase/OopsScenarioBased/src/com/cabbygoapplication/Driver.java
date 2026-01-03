package com.cabbygoapplication;

public class Driver {
	
	//vehicle attributes
	private String name;
	private String licenseNumber;
	private double rating;
	
	//constructor to initialize vehicle attributes
	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}

	//getter to get Vehicle details
	public String getName() {
		return name;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public double getRating() {
		return rating;
	}
	
	
	
}