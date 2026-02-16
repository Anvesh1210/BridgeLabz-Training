package com.smartcitytransportandservicemanagementsystem;

//Utility interface with static method
public interface GeoUtils {
	// Static method to calculate distance
	public static double calculateDistance(double point1, double point2) {
		return Math.abs(point1 - point2);
	}
}
