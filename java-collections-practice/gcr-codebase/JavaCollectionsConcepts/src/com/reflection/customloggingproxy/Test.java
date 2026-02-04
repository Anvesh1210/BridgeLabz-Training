package com.reflection.customloggingproxy;

public class Test {
	public static void main(String[] args) {
		Greeting g = new GreetingImpl();
		Greeting proxy = (Greeting) LoggingProxy.createProxy(g);
		proxy.sayHello();
	}
}
