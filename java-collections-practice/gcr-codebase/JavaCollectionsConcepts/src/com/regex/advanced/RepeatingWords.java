package com.regex.advanced;

import java.util.regex.*;

//program to find repating words from a String
public class RepeatingWords {
	public static void main(String[] args) {
		String input = "This is is a repeated repeated word test.";
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
}
