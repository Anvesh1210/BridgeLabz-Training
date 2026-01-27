package com.regex.basic;

import java.util.regex.Pattern;

public class ValidateHexColor {
	public static void main(String[] args) {
		String[] colors = { "#FFA500", "#ff4500", "#123" };
		String regex = "^#[0-9A-Fa-f]{6}$";
		Pattern pattern = Pattern.compile(regex);
		for (String color : colors) {
			if (pattern.matcher(color).matches()) {
				System.out.println(color + " → Valid");
			} else {
				System.out.println(color + " → Invalid");
			}
		}
	}
}
