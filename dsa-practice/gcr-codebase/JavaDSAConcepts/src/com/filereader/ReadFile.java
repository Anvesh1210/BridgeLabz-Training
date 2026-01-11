package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	// method to read file line by line
    public static void readFile(String filePath) {
        BufferedReader br = null;
        try {
            // create FileReader object
            FileReader fr = new FileReader(filePath);
            // wrap FileReader with BufferedReader
            br = new BufferedReader(fr);
            String line;
            // read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // close resources
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        // file path (change as needed)
        String filePath = "src/com/filereader/example.txt";

        readFile(filePath);
    }
}
