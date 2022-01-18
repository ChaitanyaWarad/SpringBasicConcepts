package com.javatpoint.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Student;

@Service
public class StudentService {

	public List<Student> getAllStudents() {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		Query query = se.createQuery("from Student");
		List<Student> studentlist = query.list();
		return studentlist;
	}

	public Student getStudent(int studentid) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		Student emp = se.get(Student.class, studentid);
		return emp;
	}

	public boolean addStudentInDB(Student stu) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		se.save(stu);
		Transaction t = se.beginTransaction();
		try {
			t.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateStudentInDB(Student stu) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		se.update(stu);
		Transaction t = se.beginTransaction();
		try {
			t.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
