package com.junit.advanced;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
	// method that converts yyyy-MM-dd to dd-MM-yyyy
	public String formatDate(String inputDate) {
		if (inputDate == null) {
			return null;
		}
		try {
			LocalDate date = LocalDate.parse(inputDate);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			return date.format(formatter);
		} catch (DateTimeParseException e) {
			return null;
		}
	}
}
