package com.multithreading.downloadmanager;

public class FileDownloaderUsingThread extends Thread {
	private String fileName;

	FileDownloaderUsingThread(String fileName, String threadName) {
	        this.fileName = fileName;
	        setName(threadName);
	    }

	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 25) {
			System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
