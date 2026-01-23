package com.sorting.cropmonitor;

public class SensorData {
	// class attributes
	private long timestamp;
	private double temperature;

	// method for initializing sensor data
	public SensorData(long timestamp, double temperature) {
		this.timestamp = timestamp;
		this.temperature = temperature;
	}

	// method for getting timestamp
	public long getTimestamp() {
		return timestamp;
	}

	// method for getting temperature
	public double getTemperature() {
		return temperature;
	}

	// method for displaying sensor data
	public void display() {
		System.out.println("Time: " + timestamp + "	   Temp: " + temperature + "°C");
	}
}
