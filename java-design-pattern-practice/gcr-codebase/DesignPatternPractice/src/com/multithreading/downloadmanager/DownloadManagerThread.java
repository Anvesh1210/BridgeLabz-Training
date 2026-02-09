package com.multithreading.downloadmanager;

public class DownloadManagerThread {
	public static void main(String[] args) throws InterruptedException {
		FileDownloaderUsingThread d1 = new FileDownloaderUsingThread("Document.pdf", "Thread-1");
		FileDownloaderUsingThread d2 = new FileDownloaderUsingThread("Image.jpg", "Thread-2");
		FileDownloaderUsingThread d3 = new FileDownloaderUsingThread("Video.mp4", "Thread-3");
		d1.start();
		d2.start();
		d3.start();
		d1.join();
		d2.join();
		d3.join();
		System.out.println("All downloads complete!");
	}
}
