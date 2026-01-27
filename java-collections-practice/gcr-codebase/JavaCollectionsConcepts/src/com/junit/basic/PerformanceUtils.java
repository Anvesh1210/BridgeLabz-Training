package com.junit.basic;

public class PerformanceUtils {

	// method for long running task
	public String longRunningTask() throws InterruptedException {
		Thread.sleep(3000);
		return "Completed";
	}
}