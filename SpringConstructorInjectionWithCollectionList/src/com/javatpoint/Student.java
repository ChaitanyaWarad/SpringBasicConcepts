package com.javatpoint;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String subject;
	private List<String> answers;

	public Student(int id, String name, String subject, List<String> answers) {
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

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

}
