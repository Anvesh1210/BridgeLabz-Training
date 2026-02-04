package com.reflection.methodexecutiontiming;

public class HeavyTask {
	public void process() {
		for (int i = 0; i < 1_000_000; i++);
	}
}
