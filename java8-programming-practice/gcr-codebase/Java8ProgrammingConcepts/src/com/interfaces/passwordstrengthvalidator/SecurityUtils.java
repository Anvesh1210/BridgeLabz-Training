package com.interfaces.passwordstrengthvalidator;

public interface SecurityUtils {
	// Static method for password validation
	static boolean isStrongPassword(String password) {
		return password.length() >= 8;
	}
}
