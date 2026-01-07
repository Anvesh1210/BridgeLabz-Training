package com.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	//method to find Longest sequence
	public static int findLongestSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        //add all elements to a HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : arr) {
            //only attempt to build a sequence if 'num' is the START of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for next numbers in the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] input = {100, 4, 200, 1, 3, 2};
        System.out.println("Input Array: " + java.util.Arrays.toString(input));
        
        int result = findLongestSequence(input);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}
