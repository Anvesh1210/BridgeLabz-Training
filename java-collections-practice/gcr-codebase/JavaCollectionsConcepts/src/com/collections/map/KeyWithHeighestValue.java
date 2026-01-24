package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHeighestValue {
	public static void main(String[] args) {
		//creating a Map
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);
		
		//logic to Key with the Highest Value
		String max = "";
		int maxValue = Integer.MIN_VALUE;
		for(String x : map.keySet()) {
			if(maxValue<map.get(x)) {
				maxValue = map.get(x);
				max = x;
			}
		}
		
		//printing the max key
		System.out.println(max);
	}
}
