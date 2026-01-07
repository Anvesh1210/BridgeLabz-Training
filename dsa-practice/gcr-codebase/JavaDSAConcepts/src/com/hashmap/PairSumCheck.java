package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PairSumCheck {
	public static void findPair(int[] arr, int target) {
        //map to store number and its index, Key: The number, Value: The index
        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            int requiredComplement = target - currentNumber;

            //check if the complement is already in the map
            if (visitedNumbers.containsKey(requiredComplement)) {
                System.out.println("Pair found: (" + requiredComplement + ", " + currentNumber + ")");
                System.out.println("Indices: " + visitedNumbers.get(requiredComplement) + " and " + i);
                return;
            }

            //store the current number and its index
            visitedNumbers.put(currentNumber, i);
        }

        System.out.println("No pair found with sum " + target);
    }

    public static void main(String[] args) {
        int[] input = {10, 15, 3, 7};
        int target = 17;
        
        System.out.println("Target: " + target);
        findPair(input, target);
    }
}
