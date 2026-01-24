package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//removing duplicate from a list
public class RemoveDuplicates {
	public static void main(String[] args) {
		//creating two lists
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 1, 2, 2, 3, 4));
		List<Integer> result = new ArrayList<>();

		//logic to remove duplicate
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        //printing the result
        System.out.println(result); 
	}
}
