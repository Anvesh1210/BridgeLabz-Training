package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Inverting A Map
public class InvertMap {
	public static void main(String[] args) {
		
		//creating a map
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A',1);
		map.put('B', 2);
		map.put('C', 1);
		
		//logic to invert map
		Map<Integer, List<Character>> invertedMap = new HashMap<Integer, List<Character>>();
		for(Character character : map.keySet()) {
			int value = map.get(character);
			List<Character> list = invertedMap.getOrDefault(value, new ArrayList<Character>());
			list.add(character);
			invertedMap.put(value, list);
		}
		
		//printing the map
		System.out.println(invertedMap);
	}
}
