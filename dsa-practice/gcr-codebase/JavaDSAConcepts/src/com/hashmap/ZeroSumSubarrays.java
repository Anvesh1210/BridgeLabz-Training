package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {
	public static void printAllZeroSumSubarrays(int[] arr) {
        //map to store sum and list of indices where this sum occurred
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        int currentSum = 0;

        //initialize with 0 sum at index -1 to handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            //if currentSum has been seen before, it means we found zero-sum subarrays
            if (sumMap.containsKey(currentSum)) {
                List<Integer> oldIndices = sumMap.get(currentSum);
                
                //print all subarrays ending at i
                for (int oldIndex : oldIndices) {
                    System.out.println("Subarray found from index " + (oldIndex + 1) + " to " + i);
                }
            }

            // Add the current index to the list for this sum
            sumMap.putIfAbsent(currentSum, new ArrayList<>());
            sumMap.get(currentSum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] input = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Input Array: " + java.util.Arrays.toString(input));
        printAllZeroSumSubarrays(input);
    }
}
