package com.collections.map;

import java.util.HashMap;
import java.util.Map;

//counting frequency of words in an String
public class WordFrequency {
	public static void main(String[] args) {
		//taking a string
		String str = "Hello world, hello Java!";
		str = str.toLowerCase().replaceAll("[^a-z0-9 ]", "");
		
		//spilt the string
		String [] strArr = str.split(" ");
		
		//finding frequency
		Map<String, Integer> frequencyCount = new HashMap<>();
		for(String s:strArr) {
			frequencyCount.put(s, frequencyCount.getOrDefault(s, 0)+1);
		}
		
		//printing frequency
		System.out.println(frequencyCount);
	}
}
