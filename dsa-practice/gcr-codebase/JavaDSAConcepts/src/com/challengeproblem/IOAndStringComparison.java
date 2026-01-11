package com.challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOAndStringComparison {

	private static final int ITERATIONS = 1_000_000;

	// stringBuilder Test
	private static long testStringBuilder() {
		StringBuilder sb = new StringBuilder(ITERATIONS * 5);
		long start = System.nanoTime();

		for (int i = 0; i < ITERATIONS; i++) {
			sb.append("hello");
		}

		long end = System.nanoTime();
		return end - start;
	}

	// stringBuffer Test
	private static long testStringBuffer() {
		StringBuffer sb = new StringBuffer(ITERATIONS * 5);
		long start = System.nanoTime();

		for (int i = 0; i < ITERATIONS; i++) {
			sb.append("hello");
		}

		long end = System.nanoTime();
		return end - start;
	}

	// FileReader Test
	private static long readWithFileReader(String filePath) {
		long wordCount = 0;
		long start = System.nanoTime();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				wordCount += line.split("\\s+").length;
			}
		} catch (IOException e) {
			System.out.println("FileReader Error: " + e.getMessage());
		}

		long end = System.nanoTime();
		System.out.println("FileReader Word Count: " + wordCount);
		return end - start;
	}

	// InputStreamReader Test
	private static long readWithInputStreamReader(String filePath) {
		long wordCount = 0;
		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(filePath);
				InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr)) {
			String line;
			while ((line = br.readLine()) != null) {
				wordCount += line.split("\\s+").length;
			}
		} catch (IOException e) {
			System.out.println("InputStreamReader Error: " + e.getMessage());
		}

		long end = System.nanoTime();
		System.out.println("InputStreamReader Word Count: " + wordCount);
		return end - start;
	}

	public static void main(String[] args) {

		// StringBuilder vs StringBuffer
		long sbTime = testStringBuilder();
		long sbufTime = testStringBuffer();

		System.out.println("StringBuilder Time : " + sbTime + " ns");
		System.out.println("StringBuffer Time  : " + sbufTime + " ns");

		// FileReader vs InputStreamReader
		String filePath = "src/com/filereader/example.txt";
		long frTime = readWithFileReader(filePath);
		long isrTime = readWithInputStreamReader(filePath);
		System.out.println("FileReader Time        : " + frTime + " ns");
		System.out.println("InputStreamReader Time : " + isrTime + " ns");
	}
}
