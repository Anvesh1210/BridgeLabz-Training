package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//reversing ArrayList and LinkedList
public class ReverseList {
	public static void main(String[] args) {
		//creating a ArrsyList
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		//creating a LinkedLists
		List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
		Collections.reverse(linkedList);
		System.out.println(linkedList);
	}
}
