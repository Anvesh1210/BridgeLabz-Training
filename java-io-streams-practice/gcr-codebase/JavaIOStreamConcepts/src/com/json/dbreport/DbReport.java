package com.json.dbreport;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class DbReport {
	public static void main(String[] args) throws Exception {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> r1 = new HashMap<>();
		r1.put("id", 101);
		r1.put("name", "Anvesh");
		list.add(r1);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(list));
	}
}
