package com.javatpoint;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentUtil {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Student stu = (Student) context.getBean("stu");
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getSubject());

		for (Map.Entry<String, String> entry : stu.getAnswers().entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();

			System.out.println(key + " : " + val);
		}

		System.out.println();

		Student stu1 = (Student) context.getBean("stu1");
		System.out.println(stu1.getId());
		System.out.println(stu1.getName());
		System.out.println(stu1.getSubject());
		for (Map.Entry<String, String> entry : stu1.getAnswers().entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();

			System.out.println(key + " : " + val);
		}
	}

}
