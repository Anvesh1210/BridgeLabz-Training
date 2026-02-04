package com.json.mergejson;

import org.json.JSONObject;

public class MergeJson {
	public static void main(String[] args) {
		JSONObject o1 = new JSONObject();
		o1.put("name", "Anvesh");
		JSONObject o2 = new JSONObject();
		o2.put("age", 22);
		for (String k : o2.keySet())
			o1.put(k, o2.get(k));
		System.out.println(o1.toString(2));
	}
}
