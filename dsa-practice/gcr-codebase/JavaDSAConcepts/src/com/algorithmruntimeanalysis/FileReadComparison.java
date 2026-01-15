package com.algorithmruntimeanalysis;

import java.io.*;

public class FileReadComparison {

	// Read file using FileReader
	public static void readUsingFileReader(String filePath) throws IOException {

		FileReader fr = new FileReader(filePath);
		int ch;

		// Read character by character
		while ((ch = fr.read()) != -1) {
			// reading data
		}
		fr.close();
	}

	// Read file using InputStreamReader
	public static void readUsingInputStreamReader(String filePath) throws IOException {

		InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
		int ch;

		// Read data
		while ((ch = isr.read()) != -1) {
			// reading data
		}
		isr.close();
	}

	public static void main(String[] args) throws IOException {

		String filePath = "largefile.txt";

		// FileReader timing
		long start = System.currentTimeMillis();
		readUsingFileReader(filePath);
		long end = System.currentTimeMillis();
		System.out.println("FileReader Time: " + (end - start) + " ms");

		// InputStreamReader timing
		start = System.currentTimeMillis();
		readUsingInputStreamReader(filePath);
		end = System.currentTimeMillis();
		System.out.println("InputStreamReader Time: " + (end - start) + " ms");
	}
}
