package com.json.listtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJson {
	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.name = "Anvesh";
		s1.age = 22;
		Student s2 = new Student();
		s2.name = "Rahul";
		s2.age = 30;
		list.add(s1);
		list.add(s2);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(list));
	}
}
