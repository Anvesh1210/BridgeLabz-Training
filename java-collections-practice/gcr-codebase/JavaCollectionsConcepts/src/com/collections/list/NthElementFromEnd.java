package com.collections.list;

import java.util.LinkedList;

public class NthElementFromEnd {
	//method to find nth element from end 
	public static String findNthFromEnd(LinkedList<String> list, int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("N must be positive");
		}
		int fast = 0;
		int slow = 0;
		for (int i = 0; i < n; i++) {
			if (fast >= list.size()) {
				throw new IllegalArgumentException("N is greater than list size");
			}
			fast++;
		}
		for (; fast < list.size(); fast++) {
			slow++;
		}
		return list.get(slow);
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		int n = 2;
		
		//printing element
		System.out.println(findNthFromEnd(list, n));
	}
}