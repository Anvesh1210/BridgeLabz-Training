package com.interfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Date utility interface
public interface DateFormatter {

	static String format(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}
}
