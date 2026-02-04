package com.annotation.taskinfo;

import java.lang.reflect.Method;

public class TaskManager {
	@TaskInfo(priority = "HIGH", assignedTo = "Anvesh")
	public void buildApp() {
	}

	public static void main(String[] args) throws Exception {
		Method m = TaskManager.class.getMethod("buildApp");
		TaskInfo t = m.getAnnotation(TaskInfo.class);
		System.out.println(t.priority());
		System.out.println(t.assignedTo());
	}
}
