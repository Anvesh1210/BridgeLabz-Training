package com.csvdatahandling;

import java.io.*;

//class to read large CSV
public class LargeCSVReader {
	public static void main(String[] args) {
		String filePath = "largefile.csv";
		int batchSize = 100;
		int totalCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int batchCount = 0;
			br.readLine();
			while ((line = br.readLine()) != null) {
				batchCount++;
				totalCount++;
				// When 100 lines are read
				if (batchCount == batchSize) {
					System.out.println("Processed records: " + totalCount);
					batchCount = 0; // reset batch
				}
			}
			// Remaining records
			if (batchCount > 0) {
				System.out.println("Processed records: " + totalCount);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
