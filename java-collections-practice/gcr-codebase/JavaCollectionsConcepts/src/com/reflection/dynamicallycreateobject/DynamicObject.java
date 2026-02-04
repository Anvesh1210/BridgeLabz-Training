package com.reflection.dynamicallycreateobject;

public class DynamicObject {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("Student");
		Object obj = cls.getDeclaredConstructor().newInstance();
		Student s = (Student) obj;
		s.show();
	}
}
