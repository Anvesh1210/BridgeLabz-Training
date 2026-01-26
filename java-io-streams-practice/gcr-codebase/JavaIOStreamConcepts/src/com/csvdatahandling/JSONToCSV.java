package com.csvdatahandling;

import java.io.*;
import org.json.*;

//class to convert JSON to csv data
public class JSONToCSV {
	public static void main(String[] args) throws Exception {
		
		String jsonData = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("students.json")));
		JSONArray array = new JSONArray(jsonData);
		FileWriter writer = new FileWriter("students.csv");
		writer.write("ID,Name,Age\n");
		for (int i = 0; i < array.length(); i++) {
			JSONObject obj = array.getJSONObject(i);
			writer.write(obj.getInt("id") + "," + obj.getString("name") + "," + obj.getInt("age") + "\n");
		}
		writer.close();
		System.out.println("JSON converted to CSV!");
	}
}
