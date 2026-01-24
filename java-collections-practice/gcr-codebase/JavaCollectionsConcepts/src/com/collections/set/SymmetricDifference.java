package com.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//finding Symmetric difference of two sets
public class SymmetricDifference {
	public static void main(String[] args) {
		//creating two sets
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
		
		//finding union and intersection
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		
		//finding symmetric difference 
		Set<Integer> symmetricdifference = new HashSet<Integer>(union);
		symmetricdifference.removeAll(intersection);
		
		//printing symmetric difference
		System.out.println("Symmetric Difference of both set: "+symmetricdifference);
		
		
	}
}
