package com.reflection.generateajsonrepresentation;

import java.lang.reflect.Field;

public class JsonUtil {
	public static String toJson(Object obj) throws Exception {
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		StringBuilder json = new StringBuilder("{");
		for (Field f : fields) {
			f.setAccessible(true);
			json.append("\"").append(f.getName()).append("\":\"").append(f.get(obj)).append("\",");
		}
		json.deleteCharAt(json.length() - 1);
		json.append("}");
		return json.toString();
	}
}
