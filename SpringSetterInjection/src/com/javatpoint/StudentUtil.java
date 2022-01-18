package com.javatpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentUtil {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Student stu = (Student) context.getBean("stu");
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getSubject());
		System.out.println();

		Student stu1 = (Student) context.getBean("stu1");
		System.out.println(stu1.getId());
		System.out.println(stu1.getName());
		System.out.println(stu1.getSubject());
	}

}
