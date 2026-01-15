package com.algorithmruntimeanalysis;

public class FibonacciComparison {
	// Recursive
	public static int fibonacciRecursive(int n) {

		// Base condition
		if (n <= 1)
			return n;

		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	// Iterative Fibonacci
	public static int fibonacciIterative(int n) {
		if (n <= 1)
			return n;
		int a = 0, b = 1, sum = 0;
		// Loop to calculate Fibonacci
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[] args) {
		int n = 30;
		// Recursive timing
		long start = System.currentTimeMillis();
		int r1 = fibonacciRecursive(n);
		long end = System.currentTimeMillis();
		System.out.println("Recursive Result: " + r1);
		System.out.println("Recursive Time: " + (end - start) + " ms");

		// Iterative timing
		start = System.currentTimeMillis();
		int r2 = fibonacciIterative(n);
		end = System.currentTimeMillis();
		System.out.println("Iterative Result: " + r2);
		System.out.println("Iterative Time: " + (end - start) + " ms");
	}
}
