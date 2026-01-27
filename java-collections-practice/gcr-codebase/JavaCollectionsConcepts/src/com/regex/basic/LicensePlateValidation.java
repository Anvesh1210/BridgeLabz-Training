package com.regex.basic;

import java.util.regex.Pattern;

public class LicensePlateValidation {
	public static void main(String[] args) {
		String[] plates = { "AB1234", "A12345", "XY9876" };
		String regex = "^[A-Z]{2}[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		for (String plate : plates) {
			if (pattern.matcher(plate).matches()) {
				System.out.println(plate + " → Valid");
			} else {
				System.out.println(plate + " → Invalid");
			}
		}
	}
}
