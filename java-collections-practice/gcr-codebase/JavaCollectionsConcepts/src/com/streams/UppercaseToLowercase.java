package com.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UppercaseToLowercase {
	public static void main(String[] args) {
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		if (!inputFile.exists()) {
			System.out.println("Input file does not exist.");
			return;
		}
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
			writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(Character.toLowerCase((char) ch));
			}
			System.out.println("File converted successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
