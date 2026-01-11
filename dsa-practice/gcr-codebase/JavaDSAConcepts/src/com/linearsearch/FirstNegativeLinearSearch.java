package com.linearsearch;

//search for the First Negative Number
public class FirstNegativeLinearSearch {
	//method to find index of first negative number
	public static int findFirstNegative(int[] arr) {
		// traverse array linearly
		for (int i = 0; i < arr.length; i++) {
			//check for negative number
			if (arr[i] < 0) {
				return i;
			}
		}

		//no negative number found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, -4, 7, -2 };
		int index = findFirstNegative(arr);
		if (index != -1) {
			System.out.println("First negative number found at index: " + index);
		} else {
			System.out.println("No negative number found in the array");
		}
	}
}
