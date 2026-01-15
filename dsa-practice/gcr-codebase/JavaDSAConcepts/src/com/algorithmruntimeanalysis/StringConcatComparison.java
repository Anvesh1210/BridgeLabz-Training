package com.algorithmruntimeanalysis;

public class StringConcatComparison {
	// User-defined method using String
	public static void useString(int n) {
		String s = "";

		// Concatenate using String
		for (int i = 0; i < n; i++) {
			s = s + "a";
		}
	}

	// User-defined method using StringBuilder
	public static void useStringBuilder(int n) {
		StringBuilder sb = new StringBuilder();

		// Concatenate using StringBuilder
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
	}

	// User-defined method using StringBuffer
	public static void useStringBuffer(int n) {
		StringBuffer sb = new StringBuffer();

		// Concatenate using StringBuffer
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
	}

	public static void main(String[] args) {

		int n = 100000; // number of operations

		// String performance
		long start = System.currentTimeMillis();
		useString(n);
		long end = System.currentTimeMillis();
		System.out.println("String Time: " + (end - start) + " ms");

		// StringBuilder performance
		start = System.currentTimeMillis();
		useStringBuilder(n);
		end = System.currentTimeMillis();
		System.out.println("StringBuilder Time: " + (end - start) + " ms");

		// StringBuffer performance
		start = System.currentTimeMillis();
		useStringBuffer(n);
		end = System.currentTimeMillis();
		System.out.println("StringBuffer Time: " + (end - start) + " ms");
	}
}
