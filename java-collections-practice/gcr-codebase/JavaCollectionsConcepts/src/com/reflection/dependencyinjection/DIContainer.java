package com.reflection.dependencyinjection;

import java.lang.reflect.Field;

public class DIContainer {

	public static <T> T create(Class<T> clazz) throws Exception {
		T obj = clazz.getDeclaredConstructor().newInstance();

		for (Field f : clazz.getDeclaredFields()) {
			if (f.isAnnotationPresent(Inject.class)) {
				Object dep = f.getType().getDeclaredConstructor().newInstance();
				f.setAccessible(true);
				f.set(obj, dep);
			}
		}
		return obj;
	}
}
