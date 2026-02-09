package com.multithreading.printshopjobscheduler;

public class PrintJob implements Runnable {
	private String jobName;
	private int pages;

	PrintJob(String jobName, int pages) {
		this.jobName = jobName;
		this.pages = pages;
	}

	@Override
	public void run() {
		for (int i = 1; i <= pages; i++) {
			System.out.println("Printing " + jobName + " - Page " + i + " of " + pages);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
