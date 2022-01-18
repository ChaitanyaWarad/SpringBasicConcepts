package com.javatpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUtilClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp = (Employee) context.getBean("emp", Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println();
		System.out.println(emp.getAddress().getAddressLine1());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getState());
		System.out.println(emp.getAddress().getCountry());
	}
}
