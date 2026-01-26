package com.streams;

import java.io.*;

public class BufferedFileCopyComparison {
	private static final int BUFFER_SIZE = 4096; // 4 KB

	public static void main(String[] args) {
		File sourceFile = new File("largefile.dat");
		File unbufferedCopy = new File("unbuffered_copy.dat");
		File bufferedCopy = new File("buffered_copy.dat");
		if (!sourceFile.exists()) {
			System.out.println("Source file does not exist.");
			return;
		}
		// Unbuffered copy
		long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, unbufferedCopy);

		// Buffered copy
		long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedCopy);

		System.out.println("\n--- Performance Comparison ---");
		System.out.println("Unbuffered Streams Time : " + unbufferedTime + " ns");
		System.out.println("Buffered Streams Time   : " + bufferedTime + " ns");

		if (bufferedTime < unbufferedTime) {
			System.out.println("Buffered streams are faster.");
		} else {
			System.out.println("Unbuffered streams are faster (rare case).");
		}
	}

	// UNBUFFERED
	private static long copyUsingUnbufferedStreams(File src, File dest) {
		long startTime = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dest)) {
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.out.println("Error during unbuffered copy.");
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	// BUFFERED
	private static long copyUsingBufferedStreams(File src, File dest) {
		long startTime = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.out.println("Error during buffered copy.");
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
