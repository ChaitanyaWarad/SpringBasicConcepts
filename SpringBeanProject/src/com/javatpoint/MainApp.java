package com.javatpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("springconfig.xml");
		ClassA a = (ClassA) con.getBean("a1");
		System.out.println(a);

	}

}
