package com.collections.set;

import java.util.HashSet;
import java.util.Set;

//checking two sets are equal or not
public class SetEqualityCheck {
	public static void main(String[] args) {
		//creating two set
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(5);
		set1.add(4);
		set1.add(9);
		set1.add(8);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(5);
		set2.add(4);
		set2.add(9);
		set2.add(8);
		
		//checking set are equal or not
		if(set1.equals(set2)) {
			System.out.println("Both sets are equal");
		}else {
			System.out.println("Sets are not equal");
		}
	}
}
