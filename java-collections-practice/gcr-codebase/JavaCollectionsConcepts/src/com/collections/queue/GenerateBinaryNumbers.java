package com.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//generating binary numbers
public class GenerateBinaryNumbers {

	// methodto generate binary numbers
	public static List<String> generateBinary(int n) {

		//list to store binary numbers
		List<String> result = new ArrayList<>();
		if (n <= 0)
			return result;
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");

		//generating binary numbers
		for (int i = 0; i < n; i++) {
			String current = queue.poll();
			result.add(current);

			queue.offer(current + "0");
			queue.offer(current + "1");
		}

		return result;
	}

	public static void main(String[] args) {
		int N = 5;
		//printing binary numbers
		System.out.println(generateBinary(N));
	}
}
