package com.csvdatahandling;

import java.io.*;
import org.json.*;

//class to convert CSV to JSon
public class CSVToJSON {
	public static void main(String[] args) throws Exception {
		//creating BufferedReader
		BufferedReader br = new BufferedReader(new FileReader("students.csv"));
		JSONArray array = new JSONArray();
		br.readLine();
		String line;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			JSONObject obj = new JSONObject();
			obj.put("id", data[0]);
			obj.put("name", data[1]);
			obj.put("age", data[2]);
			array.put(obj);
		}
		//closing br
		br.close();
		FileWriter writer = new FileWriter("students.json");
		writer.write(array.toString(4));
		writer.close();
		System.out.println("CSV converted to JSON!");
	}
}
