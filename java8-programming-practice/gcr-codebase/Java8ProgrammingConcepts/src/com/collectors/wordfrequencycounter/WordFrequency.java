package com.collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		String paragraph = "Java is powerful and Java is popular and Java is everywhere";

		Map<String, Integer> counter = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
		System.out.println(counter);
	}
}
