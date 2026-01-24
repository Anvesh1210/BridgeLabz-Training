package com.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//finding Union and intersection of two sets
public class UnionAndIntersection {
	public static void main(String[] args) {
		//creating two sets
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5));
		
		//creating union set and finding union
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		
		//creating intersection set and finding intersection
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		
		//printing union and intersection
		System.out.println("Union: "+union);
		System.out.println("Intersection: "+intersection);
	}
}
