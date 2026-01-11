package com.binarysearch;

public class FirstAndLastOccurrence {
	// method to find first occurrence
	public static int findFirst(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				result = mid;
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	// method to find last occurrence
	public static int findLast(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				result = mid;
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 4, 4, 6, 7, 8 };
		int target = 4;
		int first = findFirst(arr, target);
		int last = findLast(arr, target);
		if (first != -1) {
			System.out.println("First occurrence at index: " + first);
			System.out.println("Last occurrence at index : " + last);
		} else {
			System.out.println("Element not found");
		}
	}
}
