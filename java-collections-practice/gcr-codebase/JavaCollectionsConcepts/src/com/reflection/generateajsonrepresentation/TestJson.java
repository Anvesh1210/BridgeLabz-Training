package com.reflection.generateajsonrepresentation;

public class TestJson {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		System.out.println(JsonUtil.toJson(s));
	}
}
