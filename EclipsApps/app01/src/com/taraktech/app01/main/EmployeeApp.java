package com.taraktech.app01.main;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.taraktech.app01.entities.Employee;

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEno(333);
		employee.setEname("Amar");
		employee.setEsal( 100000F);
		employee.setEaddr("CVM");
		Integer saveCount = (Integer) session.save(employee);
		
		transaction.commit();
		
		if (saveCount == 333) {
			System.out.println("Employee is inserted successfully.... ");
		}else {
			System.out.println("Employee is not inserted..... ");
		}
		
		session.close();
		sessionFactory.close();
		
	}

}
