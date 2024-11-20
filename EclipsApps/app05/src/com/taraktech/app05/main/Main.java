package com.taraktech.app05.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.taraktech.app05.entities.Employee;

public class Main {	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		
		configuration.setProperty("hibernate.connection.driver_Class", "com.mysql.cj.jdbc.Driver");
		configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/tarakdb");
		configuration.setProperty("hibernate.connection.user", "root");
		configuration.setProperty("hibernate.connection.password", "root");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		configuration.setProperty("hibernate.show_sql", "true");
		//configuration.addResource("com.taraktech.app05.entities.Employee");
		configuration.addAnnotatedClass(com.taraktech.app05.entities.Employee.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class, 111);
		
		System.out.println("Employee Details........");
		
		System.out.println("Employee Number    :   "+employee.getEno());
		System.out.println("Employee Name      :   "+employee.getEname());
		System.out.println("Employee Salary    :   "+employee.getEsal());
		System.out.println("Employee Address   :   "+employee.getEaddr());
		
		sessionFactory.close();
		session.close();
		
	}
}
