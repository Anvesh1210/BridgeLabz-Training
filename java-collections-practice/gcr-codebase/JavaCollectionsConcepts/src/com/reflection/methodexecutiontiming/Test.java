package com.reflection.methodexecutiontiming;

public class Test {
	public static void main(String[] args) throws Exception {
		HeavyTask task = new HeavyTask();
		MethodTimer.execute(task, "process");
	}
}
