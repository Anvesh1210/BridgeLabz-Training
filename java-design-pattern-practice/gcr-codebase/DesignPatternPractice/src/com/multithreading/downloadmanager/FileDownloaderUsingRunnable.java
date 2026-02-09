package com.multithreading.downloadmanager;

public class FileDownloaderUsingRunnable implements Runnable {
	private String fileName;

	FileDownloaderUsingRunnable(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 25) {
			System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}