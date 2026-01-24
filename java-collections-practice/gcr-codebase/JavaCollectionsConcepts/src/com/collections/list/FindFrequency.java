package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//finding frequency od each element in a list
public class FindFrequency {
	
	//method to find frequency
	public static Map<String, Integer> findFrequenct(List<String> list){
		Map<String, Integer> map = new HashMap<>();
		for(String s: list) {
			map.put(s,map.getOrDefault(s, 0)+1);
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		//creating a list
		List<String> list = new ArrayList<String>(Arrays.asList("Hello", "Hii", "Hello", "Hii", "Bye"));
		Map<String,Integer> map = findFrequenct(list);
		
		//printing frequency
		System.out.println(map);
	}
}
