package com.collections.map;

import java.util.HashMap;
import java.util.Map;

//merging two map and adding common values
public class MergeMap {
	public static void main(String[] args) {
		
		//creating two hashmaps
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 22);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("B",3);
		map2.put("C",4);
		map2.put("D",28);
		
		//logic to merge two map
		Map<String,Integer> mergedMap = new HashMap<String, Integer>(map1);
		
		for(String s: map2.keySet()) {
			mergedMap.put(s, mergedMap.getOrDefault(s, 0)+map2.get(s));
		}
		
		//printing map
		System.out.println(mergedMap);
	}
}
