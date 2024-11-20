package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction=session.beginTransaction();

		
		Employee emp1=new Employee(111,"abc","abc@gmail.com",50000);
		Employee emp2=new Employee(222,"lmn","lmn@gmail.com",60000);
		Employee emp3=new Employee(333,"xyz","xyz@gmail.com",70000);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		transaction.commit();
		session.close();
		sf.close();
	}
}
