package com.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//checking set1 is subset of set2 or not
public class CheckSubsets {
	public static void main(String[] args) {
		//creating two sets
		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		
		//printing set1 is subset of set2 or not
		System.out.println("Is set1 is a subset of set2: "+set2.containsAll(set1));
	}
}
