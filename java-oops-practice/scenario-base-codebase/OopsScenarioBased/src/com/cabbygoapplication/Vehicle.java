package com.cabbygoapplication;

public class Vehicle {
	
	//vehicle attributes
	private String vehicleNumber;
	private int capacity;
	private String type;
	private double ratePerKm;
	
	//constructor to initialize vehicle
	public Vehicle(String vehicleNumber, int capacity, String type,double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.ratePerKm = ratePerKm;
	}
	
	 public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public int getCapacity() {
	        return capacity;
	    }

	    public String getType() {
	        return type;
	    }

	    public double getRatePerKm() {
	        return ratePerKm;
	    }
}
