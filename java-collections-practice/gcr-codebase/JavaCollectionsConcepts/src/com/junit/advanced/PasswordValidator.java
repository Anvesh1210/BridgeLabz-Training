package com.junit.advanced;

public class PasswordValidator {
	// method to check given password is valid or not
	public boolean isValid(String password) {
		if (password == null) {
			return false;
		}
		if (password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			}
			if (Character.isDigit(ch)) {
				hasDigit = true;
			}
		}
		return hasUpperCase && hasDigit;
	}
}
