package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] findTwoSumIndices(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;

            //check if the 'complement' exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            //if not found, add the current number and its index to the map
            map.put(currentNumber, i);
        }

        //return empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] input = {2, 11, 7, 15};
        int target = 9;

        int[] result = findTwoSumIndices(input, target);

        if (result.length == 2) {
            System.out.println("Pair found at indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: " + input[result[0]] + " + " + input[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found.");
        }
    }
}
