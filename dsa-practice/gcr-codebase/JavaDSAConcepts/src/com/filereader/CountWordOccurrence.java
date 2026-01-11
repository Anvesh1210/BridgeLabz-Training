package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrence {
	
	// method to count word occurrences in a file
    public static int countWord(String filePath, String targetWord) {
        int count = 0;
        // FileReader wrapped with BufferedReader (try-with-resources)
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                //split line into words (handles spaces and punctuation)
                String[] words = line.split("\\W+");
                //check each word
                for(String word : words) {
                    if(word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return count;
    }
    public static void main(String[] args) {
        // file path (update if needed)
        String filePath = "src/com/filereader/example.txt";
        String targetWord = "java";
        int occurrences = countWord(filePath, targetWord);
        System.out.println("Word \"" + targetWord + "\" occurred " + occurrences + " times.");
    }
}