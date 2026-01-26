package com.csvdatahandling;

import java.io.*;
import java.util.*;

//class to merge CSV files
public class MergeCSVFiles {
	public static void main(String[] args) {
		String file1 = "students1.csv";
		String file2 = "students2.csv";
		String outputFile = "merged_students.csv";
		Map<String, String> marksMap = new HashMap<>();
		try {
			// Read second CSV into map
			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			br2.readLine(); // skip header
			String line;
			while ((line = br2.readLine()) != null) {
				String[] data = line.split(",");
				marksMap.put(data[0], data[1] + "," + data[2]);
			}
			br2.close();
			// Read first CSV and merge
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			FileWriter writer = new FileWriter(outputFile);
			writer.write("ID,Name,Age,Marks,Grade\n");
			br1.readLine(); // skip header
			while ((line = br1.readLine()) != null) {
				String[] data = line.split(",");
				String extra = marksMap.get(data[0]);
				if (extra != null) {
					writer.write(data[0] + "," + data[1] + "," + data[2] + "," + extra + "\n");
				}
			}
			br1.close();
			writer.close();
			System.out.println("CSV files merged successfully!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
