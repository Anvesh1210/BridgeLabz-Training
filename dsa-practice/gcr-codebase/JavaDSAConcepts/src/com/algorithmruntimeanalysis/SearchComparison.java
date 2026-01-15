package com.algorithmruntimeanalysis;

import java.util.Arrays;

public class SearchComparison {
	// User-defined method for Linear Search
	public static int linearSearch(int[] arr, int target) {

		// Loop through array
		for (int i = 0; i < arr.length; i++) {

			// Check if element matches target
			if (arr[i] == target) {
				return i;
			}
		}
		// Target not found
		return -1;
	}

	// User-defined method for Binary Search
	public static int binarySearch(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		// Search until range is valid
		while (left <= right) {

			int mid = (left + right) / 2;

			// If target found
			if (arr[mid] == target) {
				return mid;
			}

			// Move to right half
			if (arr[mid] < target) {
				left = mid + 1;
			}
			// Move to left half
			else {
				right = mid - 1;
			}
		}
		// Target not found
		return -1;
	}

	public static void main(String[] args) {

		int size = 100000;
		int target = 99999;
		int[] data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = i;
		}

		// Linear Search timing
		long start = System.nanoTime();
		linearSearch(data, target);
		long end = System.nanoTime();
		System.out.println("Linear Search Time: " + (end - start) + " ns");

		// Sort array for Binary Search
		Arrays.sort(data);

		// Binary Search timing
		start = System.nanoTime();
		binarySearch(data, target);
		end = System.nanoTime();
		System.out.println("Binary Search Time: " + (end - start) + " ns");
	}
}
