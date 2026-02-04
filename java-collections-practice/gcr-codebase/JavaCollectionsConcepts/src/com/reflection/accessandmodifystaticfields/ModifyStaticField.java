package com.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Configuration.class;
		Field field = cls.getDeclaredField("API_KEY");
		field.setAccessible(true);
		System.out.println("Old API_KEY: " + field.get(null));
		field.set(null, "NEW_SECRET_KEY");
		System.out.println("New API_KEY: " + field.get(null));
	}
}
