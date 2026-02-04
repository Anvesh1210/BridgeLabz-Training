package com.annotation.todo;

import java.lang.reflect.Method;

public class TodoDemo {
	@Todo(task = "Add login", assignedTo = "Anvesh")
	public void login() {
	}

	@Todo(task = "Add payment", assignedTo = "Rahul", priority = "HIGH")
	public void payment() {
	}

	public static void main(String[] args) {
		for (Method m : TodoDemo.class.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Todo.class)) {
				Todo t = m.getAnnotation(Todo.class);
				System.out.println(t.task() + " -> " + t.assignedTo());
			}
		}
	}
}
