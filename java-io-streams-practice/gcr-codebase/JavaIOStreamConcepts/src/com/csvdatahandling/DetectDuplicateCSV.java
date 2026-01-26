package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {
	public static void main(String[] args) {
		String filePath = "students.csv";
		// Set to store unique IDs
		Set<String> idSet = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine(); // skip heade
			System.out.println("Duplicate Records:");
			System.out.println("--------------------");
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				if (!idSet.add(id)) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
