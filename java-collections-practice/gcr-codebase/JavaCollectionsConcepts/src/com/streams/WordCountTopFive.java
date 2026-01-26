package com.streams;

import java.io.*;
import java.util.*;

public class WordCountTopFive {
	public static void main(String[] args) {
		File file = new File("input.txt");
		if (!file.exists()) {
			System.out.println("File not found.");
			return;
		}
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.toLowerCase().split("\\W+");
				for (String word : words) {
					if (word.isEmpty())
						continue;
					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// sort by Frequency
		List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());
		list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		// Display Top 5
		System.out.println("Top 5 Most Frequent Words:");
		int count = 0;
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			count++;
			if (count == 5)
				break;
		}
	}
}
