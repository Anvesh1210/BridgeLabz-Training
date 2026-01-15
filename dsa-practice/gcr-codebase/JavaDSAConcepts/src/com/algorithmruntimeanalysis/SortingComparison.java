package com.algorithmruntimeanalysis;

import java.util.Random;

public class SortingComparison {
	// User-defined Bubble Sort method
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		// Compare adjacent elements
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Swap if order is wrong
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// User-defined Merge Sort method
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	// Merge two sorted parts
	public static void merge(int[] arr, int left, int mid, int right) {

		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, k = 0;

		// Merge elements
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		// Copy remaining elements
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= right)
			temp[k++] = arr[j++];

		// Copy back to original array
		for (int x = 0; x < temp.length; x++) {
			arr[left + x] = temp[x];
		}
	}

	// User-defined Quick Sort method
	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int p = partition(arr, low, high);

			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	// Partition logic
	public static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		// Rearrange elements
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Place pivot correctly
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int size = 10000;
		int[] data = new int[size];
		Random r = new Random();

		// Generate random data
		for (int i = 0; i < size; i++) {
			data[i] = r.nextInt(size);
		}

		int[] a1 = data.clone();
		int[] a2 = data.clone();
		int[] a3 = data.clone();

		// Bubble Sort timing
		long start = System.currentTimeMillis();
		bubbleSort(a1);
		long end = System.currentTimeMillis();
		System.out.println("Bubble Sort Time: " + (end - start) + " ms");

		// Merge Sort timing
		start = System.currentTimeMillis();
		mergeSort(a2, 0, a2.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Merge Sort Time: " + (end - start) + " ms");

		// Quick Sort timing
		start = System.currentTimeMillis();
		quickSort(a3, 0, a3.length - 1);
		end = System.currentTimeMillis();
		System.out.println("Quick Sort Time: " + (end - start) + " ms");
	}
}
