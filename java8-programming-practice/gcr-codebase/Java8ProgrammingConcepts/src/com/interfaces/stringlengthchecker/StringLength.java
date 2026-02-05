package com.interfaces.stringlengthchecker;

import java.util.function.Function;

public class StringLength {
	public static void main(String[] args) {
		Function<String, Integer> lengthChecker = msg -> msg.length();
		String message = "Java Functional Interface";
		System.out.println("Length: " + lengthChecker.apply(message));
	}
}
