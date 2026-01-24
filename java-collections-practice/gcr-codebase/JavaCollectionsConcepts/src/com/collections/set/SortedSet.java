package com.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//converting a set into a sorted list
public class SortedSet {
	public static void main(String[] args) {
		//creating a set
		Set<Integer> set = new HashSet<>(Arrays.asList(5, 9,3, 1));
		
		//creating a list and pass set as argument
		List<Integer> list = new ArrayList<>(set);
		
		//sorting the list
		Collections.sort(list);
		
		//printing sorted list
		System.out.println("Sorted list for set "+set+ " is " +list);
	}
}
