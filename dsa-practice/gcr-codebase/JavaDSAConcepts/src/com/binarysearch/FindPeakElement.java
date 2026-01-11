package com.binarysearch;

public class FindPeakElement {
	// method to find index of a peak element
	public static int findPeak(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		// binary search approach
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] < arr[mid + 1]) {
				left = mid + 1;
			}
			// otherwise, peak is on the left side (including mid)
			else {
				right = mid;
			}
		}
		// left == right is the index of a peak element
		return left;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 20, 4, 1, 0 };
		int peakIndex = findPeak(arr);
		System.out.println("Peak element index: " + peakIndex);
		System.out.println("Peak element value: " + arr[peakIndex]);
	}
}
