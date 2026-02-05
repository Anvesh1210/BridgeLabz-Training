package com.interfaces.dateformatutility;

import java.time.LocalDate;

public class DateDriver {
	public static void main(String[] args) {
		System.out.println(DateFormatter.format(LocalDate.now()));
	}
}
