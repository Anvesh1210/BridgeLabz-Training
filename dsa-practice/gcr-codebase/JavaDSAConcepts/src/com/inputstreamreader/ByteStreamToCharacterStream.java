package com.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class ByteStreamToCharacterStream {

    // method to read file using InputStreamReader
    public static void readFile(String filePath) {
		// try-with-resources ensures proper closing
	    try (
	        FileInputStream fis = new FileInputStream(filePath);
	        InputStreamReader isr =
	            new InputStreamReader(fis, StandardCharsets.UTF_8);
	        BufferedReader br = new BufferedReader(isr)
	    ) {
	        String line;
	
	        // read file line by line
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	
	    } catch (IOException e) {
	        System.out.println("Error reading file: " + e.getMessage());
	    }
	}
	
	public static void main(String[] args) {
	
	    // file path (update if needed)
	    String filePath = "src/com/filereader/example.txt";
	
	    readFile(filePath);
	}
}
