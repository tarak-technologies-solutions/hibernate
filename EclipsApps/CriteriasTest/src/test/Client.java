package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	
	
	Employee e1=new Employee(111, "abc", "abc@gmail.com", 60000);
	Employee e2=new Employee(222, "lmn", "lmn@gmail.com", 70000);
	Employee e3=new Employee(444, "def", "def@gmail.com", 80000);
	Employee e4=new Employee(555, "xyz", "xyz@gmail.com", 90000);
	
	
	session.save(e1);
	session.save(e2);
	session.save(e3);
	session.save(e4);
	transaction.commit();
	session.close();
	sf.close();
	System.out.println("insertion success");
	
	
	
	
}
}
