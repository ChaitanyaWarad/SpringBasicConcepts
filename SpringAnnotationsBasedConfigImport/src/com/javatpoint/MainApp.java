package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!!!");
		System.out.println(helloWorld.getMessage());

		NewWorld newWorld = ctx.getBean(NewWorld.class);
		newWorld.setNewMessage("New World!!!");
		System.out.println(newWorld.getNewMessage());
	}

}
