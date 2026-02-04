package com.annotation.cache;

import java.util.HashMap;

public class CacheDemo {
	static HashMap<Integer, Integer> cache = new HashMap<>();

	@CacheResult
	public static int square(int n) {
		System.out.println("Computing...");
		return n * n;
	}

	public static void main(String[] args) {
		int n = 5;
		if (cache.containsKey(n))
			System.out.println(cache.get(n));
		else {
			int r = square(n);
			cache.put(n, r);
			System.out.println(r);
		}
		System.out.println(cache.get(n));
	}
}
