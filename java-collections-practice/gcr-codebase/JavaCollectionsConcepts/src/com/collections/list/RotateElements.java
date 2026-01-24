package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//rotating element in a list
public class RotateElements {	
	public static void main(String[] args) {
		//creating a ArrayList of integer
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		//calling collections.rotate function
		Collections.rotate(list, -2);
		//printing the list
		System.out.println(list);
	}
}
