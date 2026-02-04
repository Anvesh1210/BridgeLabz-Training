package com.reflection.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {
	public static void main(String[] args) throws Exception {
		
		Class<?> cls = Class.forName("com.reflection.getclassinformation.Demo");
		
		System.out.println("Class Name: " + cls.getName());

		System.out.println("\nFields:");
		for (Field f : cls.getDeclaredFields()) {
			System.out.println(f.getName());
		}

		System.out.println("\nMethods:");
		for (Method m : cls.getDeclaredMethods()) {
			System.out.println(m.getName());
		}

		System.out.println("\nConstructors:");
		for (Constructor<?> c : cls.getDeclaredConstructors()) {
			System.out.println(c);
		}
	}
}
