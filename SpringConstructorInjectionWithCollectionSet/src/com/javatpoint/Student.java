package com.javatpoint;

import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private String subject;
	private Set<String> answers;

	public Student(int id, String name, String subject, Set<String> answers) {
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

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

}
