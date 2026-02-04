package com.annotation.logtime;

import java.lang.reflect.Method;


public class ExecutionDemo {
	@LogExecutionTime
	public void slowMethod() throws Exception {
		Thread.sleep(500);
	}

	public static void main(String[] args) throws Exception {
		ExecutionDemo obj = new ExecutionDemo();
		Method m = ExecutionDemo.class.getMethod("slowMethod");
		long start = System.nanoTime();
		m.invoke(obj);
		long end = System.nanoTime();
		System.out.println("Time: " + (end - start));
	}
}
