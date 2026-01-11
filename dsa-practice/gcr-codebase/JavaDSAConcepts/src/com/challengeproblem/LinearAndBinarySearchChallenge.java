package com.challengeproblem;

import java.util.Arrays;

public class LinearAndBinarySearchChallenge {
	// Find the first missing positive integer
	public static int firstMissingPositive(int[] arr) {
		int n = arr.length;
		// Replace non-positive and > n values
		for (int i = 0; i < n; i++) {
			if (arr[i] <= 0 || arr[i] > n) {
				arr[i] = n + 1;
			}
		}

		// Mark visited numbers
		for (int i = 0; i < n; i++) {
			int value = Math.abs(arr[i]);
			if (value >= 1 && value <= n) {
				arr[value - 1] = -Math.abs(arr[value - 1]);
			}
		}

		// Find first missing positive
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;
	}

	// Find index of target after sorting
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 4, -1, 1 };
		int target = 4;
		// Copy array because firstMissingPositive modifies it
		int[] copyForLinear = Arrays.copyOf(numbers, numbers.length);
		// Linear Search result
		int missing = firstMissingPositive(copyForLinear);
		System.out.println("First missing positive integer: " + missing);
		// Binary Search requires sorted array
		Arrays.sort(numbers);
		int index = binarySearch(numbers, target);
		System.out.println("Sorted array: " + Arrays.toString(numbers));
		System.out.println("Index of target " + target + ": " + index);
	}
}
