package com.binarysearch;

public class SearchIn2DMatrix {
	// method to search target in 2D matrix
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		if (rows == 0)
			return false;
		int cols = matrix[0].length;
		int left = 0;
		int right = rows * cols - 1;
		// binary search on flattened matrix
		while (left <= right) {
			int mid = left + (right - left) / 2;
			// convert 1D index to 2D indices
			int row = mid / cols;
			int col = mid % cols;
			int midValue = matrix[row][col];
			if (midValue == target) {
				return true;
			} else if (midValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 16;
		boolean found = searchMatrix(matrix, target);
		System.out.println("Target found: " + found);
	}
}
