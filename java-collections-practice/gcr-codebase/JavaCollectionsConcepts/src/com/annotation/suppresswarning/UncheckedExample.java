package com.annotation.suppresswarning;

import java.util.ArrayList;

public class UncheckedExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(10);
		list.forEach(System.out::println);
	}
}
