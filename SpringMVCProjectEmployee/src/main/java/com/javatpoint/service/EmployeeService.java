package com.javatpoint.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.javatpoint.dto.Employee;

@Service
public class EmployeeService {

	public Boolean addEmployeeDB(Employee newEmployee) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sess = con.buildSessionFactory();
		Session se = sess.openSession();
		se.save(newEmployee);
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
