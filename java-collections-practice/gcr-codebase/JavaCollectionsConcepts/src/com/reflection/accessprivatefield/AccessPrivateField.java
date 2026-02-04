package com.reflection.accessprivatefield;

import java.lang.reflect.*;

public class AccessPrivateField {
	public static void main(String[] args) throws Exception {
		Person p = new Person();

		Class<?> cls = p.getClass();
		Field field = cls.getDeclaredField("age");
		field.setAccessible(true);

		System.out.println("Old Age: " + field.get(p));

		field.set(p, 30);
		System.out.println("New Age: " + field.get(p));
	}
}
