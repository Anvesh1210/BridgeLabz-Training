package com.reflection.getclassinformation;

public class Demo {
	private int id;
	public String name;

	public Demo() {
	}

	public Demo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println("Show method");
	}

	private void secret() {
		System.out.println("Secret method");
	}
}
