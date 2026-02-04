package com.reflection.invokeprivatemethod;

import java.lang.reflect.*;

public class InvokePrivateMethod {
	public static void main(String[] args) throws Exception {
		Calculator calc = new Calculator();

		Class<?> cls = calc.getClass();
		Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
		method.setAccessible(true);

		Object result = method.invoke(calc, 5, 4);
		System.out.println("Result: " + result);
	}
}
