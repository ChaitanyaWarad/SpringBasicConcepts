package com.javatpoint;

import java.util.Map;

public class Student {

	private int id;
	private String name;
	private String subject;
	private Map<String, String> answers;
	
	public Student(int id, String name, String subject, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
}
