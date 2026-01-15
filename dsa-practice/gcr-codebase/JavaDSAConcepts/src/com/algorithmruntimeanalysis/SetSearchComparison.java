package com.algorithmruntimeanalysis;

import java.util.*;

public class SetSearchComparison {
	// Search in array
	public static boolean arraySearch(int[] arr, int target) {

		// Linear search
		for (int x : arr) {
			if (x == target)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int size = 100000;
		int target = size - 1;

		int[] arr = new int[size];
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Fill data
		for (int i = 0; i < size; i++) {
			arr[i] = i;
			hashSet.add(i);
			treeSet.add(i);
		}

		// Array search timing
		long start = System.currentTimeMillis();
		arraySearch(arr, target);
		long end = System.currentTimeMillis();
		System.out.println("Array Search Time: " + (end - start) + " ms");

		// HashSet search timing
		start = System.currentTimeMillis();
		hashSet.contains(target);
		end = System.currentTimeMillis();
		System.out.println("HashSet Search Time: " + (end - start) + " ms");

		// TreeSet search timing
		start = System.currentTimeMillis();
		treeSet.contains(target);
		end = System.currentTimeMillis();
		System.out.println("TreeSet Search Time: " + (end - start) + " ms");
	}
}
