package com.taraktech.app03.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.taraktech.app03.entities.Employee;
import com.taraktech.app03.utility.HibernateUtility;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String add(Employee employee) {
		String status = "";
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Integer pkValue = (Integer) session.save(employee);
			
			if (pkValue == employee.getEno()) {
				
				transaction.commit();
				status = " INSERTION SUCCESS";
				
			}else {
				
				transaction.rollback();
				status = "INSERTION FAILURE";
				
			}
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
			status = "INSERTION FAILURE";
			
		}
		return status;
	}

	@Override
	public Employee search(Integer eno) {
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.get(Employee.class, eno);
		
		return employee;
	}

	@Override
	public String update(Employee employee) {
		
		String status = "";
		Transaction transaction = null;
		
		try {
			
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(employee);
			transaction.commit();
			status = "UPDATE SUCCESS";
		} catch (Exception e) {
			transaction.rollback();
			status = "UPDATE FAILURE";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String delete(Employee employee) {
		
		String status ="";
		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.delete(employee);
			transaction.commit();
			status = "DELETE SUCCESS";;
		} catch (Exception e) {
			transaction.rollback();
			status = "DELETE FAILURE";
			e.printStackTrace();
		}
				
		return status;
	}

}
