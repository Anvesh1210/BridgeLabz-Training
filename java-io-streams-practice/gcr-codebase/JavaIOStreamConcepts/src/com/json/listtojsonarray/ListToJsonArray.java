package com.json.listtojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJsonArray {
	public static void main(String[] args) throws Exception {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> u1 = new HashMap<>();
		u1.put("name", "Anvesh");
		u1.put("age", 22);
		list.add(u1);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(list));
	}
}
