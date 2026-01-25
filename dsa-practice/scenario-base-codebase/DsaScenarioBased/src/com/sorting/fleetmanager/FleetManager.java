package com.sorting.fleetmanager;

//class to represent Fleet Manager
public class FleetManager {
	// method for merge sort
	public void mergeSort(Vehicle[] vehicles) {
		if (vehicles.length < 2) {
			return;
		}
		int mid = vehicles.length / 2; // ✅ FIX HERE
		Vehicle[] left = new Vehicle[mid];
		Vehicle[] right = new Vehicle[vehicles.length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = vehicles[i];
		}
		for (int i = mid; i < vehicles.length; i++) {
			right[i - mid] = vehicles[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(vehicles, left, right);
	}

	// method for merging two sorted vehicle lists
	private void merge(Vehicle[] result, Vehicle[] left, Vehicle[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i].getMileage() <= right[j].getMileage()) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}
		// method for copying remaining left elements
		while (i < left.length) {
			result[k++] = left[i++];
		}
		// method for copying remaining right elements
		while (j < right.length) {
			result[k++] = right[j++];
		}
	}

	// method for displaying vehicle list
	public void displayVehicles(Vehicle[] vehicles) {
		for (Vehicle v : vehicles) {
			v.display();
		}
	}
}
