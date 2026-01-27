package com.junit.basic;

public class StringUtils {
	//reverse a String method
	public String reverse(String str) {
		if (str == null) {
			return null;
		}
		return new StringBuilder(str).reverse().toString();
	}

	//method to check given string is palindrome or not
	public boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		String reversed = reverse(str);
		return str.equals(reversed);
	}

	//convert a STring to uppercase
	public String toUpperCase(String str) {
		if (str == null) {
			return null;
		}
		return str.toUpperCase();
	}
}
