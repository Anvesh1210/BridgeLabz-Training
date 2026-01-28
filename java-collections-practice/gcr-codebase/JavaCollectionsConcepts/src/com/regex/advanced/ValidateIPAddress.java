package com.regex.advanced;

public class ValidateIPAddress {
	public static void main(String[] args) {
		String ip = "192.168.1.1";
		String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
		boolean isValid = ip.matches(regex);
		System.out.println(isValid ? "Valid IP Address" : "Invalid IP Address");
	}
}
