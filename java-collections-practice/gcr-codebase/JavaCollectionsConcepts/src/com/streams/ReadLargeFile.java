package com.streams;

import java.io.*;

//class to read large file data 
public class ReadLargeFile {
	public static void main(String[] args) {
		File file = new File("largefile.txt");
		if (!file.exists()) {
			System.out.println("File not found.");
			return;
		}
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
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
	}
}
