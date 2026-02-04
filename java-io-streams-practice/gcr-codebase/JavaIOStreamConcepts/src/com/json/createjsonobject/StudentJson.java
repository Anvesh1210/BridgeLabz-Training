package com.json.createjsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
	public static void main(String[] args) {
		JSONObject student = new JSONObject();
		student.put("name", "Anvesh");
		student.put("age", 22);
		JSONArray subjects = new JSONArray();
		subjects.put("Java");
		subjects.put("Spring");
		subjects.put("SQL");
		student.put("subjects", subjects);
		System.out.println(student.toString(2));
	}
}
