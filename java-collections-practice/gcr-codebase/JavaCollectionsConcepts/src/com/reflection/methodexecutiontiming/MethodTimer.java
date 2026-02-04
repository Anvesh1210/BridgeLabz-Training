package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodTimer {
	public static void execute(Object obj, String methodName) throws Exception {
		Method method = obj.getClass().getMethod(methodName);
		long start = System.nanoTime();
		method.invoke(obj);
		long end = System.nanoTime();
		System.out.println("Execution time: " + (end - start) + " ns");
	}
}
