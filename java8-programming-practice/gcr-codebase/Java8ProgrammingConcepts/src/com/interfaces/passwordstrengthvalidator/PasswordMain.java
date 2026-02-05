package com.interfaces.passwordstrengthvalidator;

public class PasswordMain {
	public static void main(String[] args) {
		System.out.println(SecurityUtils.isStrongPassword("Java@1234"));
	}
}
