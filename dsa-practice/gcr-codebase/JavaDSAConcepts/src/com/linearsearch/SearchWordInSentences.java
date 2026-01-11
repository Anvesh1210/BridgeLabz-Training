package com.linearsearch;

public class SearchWordInSentences {
	// method to search for first sentence containing the word
	public static String findSentenceWithWord(String[] sentences, String word) {
		// traverse sentences linearly
		for (int i = 0; i < sentences.length; i++) {
			// check if sentence contains the word (case-insensitive)
			if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
				return sentences[i];
			}
		}
		// word not found in any sentence
		return "Not Found";
	}

	public static void main(String[] args) {
		String[] sentences = { "Java is a powerful language", "I love data structures", "Linear search is simple",
				"Algorithms are important" };
		String word = "search";
		String result = findSentenceWithWord(sentences, word);
		System.out.println(result);
	}
}
