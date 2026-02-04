package com.annotation.bugreport;

import java.lang.reflect.Method;

public class BugTracker {
	@BugReport(description = "Null bug")
	@BugReport(description = "Memory leak")
	public void process() {
	}

	public static void main(String[] args) throws Exception {
		Method m = BugTracker.class.getMethod("process");
		for (BugReport b : m.getAnnotationsByType(BugReport.class))
			System.out.println(b.description());
	}
}
