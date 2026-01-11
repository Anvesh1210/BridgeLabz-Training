package com.binarysearch;

public class FindRotationPoint {
	// method to find index of smallest element (rotation point)
	public static int findRotationPoint(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		// binary search
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		// left == right is the index of smallest element
		return left;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int rotationIndex = findRotationPoint(arr);
		System.out.println("Rotation point index: " + rotationIndex);
		System.out.println("Smallest element: " + arr[rotationIndex]);
	}
}
