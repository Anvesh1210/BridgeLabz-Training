package com.multithreading.printshopjobscheduler;

public class PrintJobDriver {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread[] jobs = { new Thread(new PrintJob("Job1", 10)), new Thread(new PrintJob("Job2", 5)),
				new Thread(new PrintJob("Job3", 15)), new Thread(new PrintJob("Job4", 8)),
				new Thread(new PrintJob("Job5", 12)) };
		int[] priorities = { 5, 8, 3, 6, 7 };
		for (int i = 0; i < jobs.length; i++) {
			jobs[i].setPriority(priorities[i]);
			jobs[i].start();
		}
		for (Thread t : jobs) {
			t.join();
		}
		long end = System.currentTimeMillis();
		System.out.println("All jobs completed in " + (end - start) + "ms");
	}
}
