package test;

import model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertClient {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	
	Employee e1=new Employee();
	e1.setEid(111);
	e1.setEname("abc");
	e1.setEmail("abc@gmail.com");
	e1.setSalary(500000);

	Employee e2=new Employee();
	e2.setEid(222);
	e2.setEname("lmn");
	e2.setEmail("lmn@gmail.com");
	e2.setSalary(600000);
	
	s.save(e1);
	s.save(e2);
	s.beginTransaction().commit();
	System.out.println("success");
}
}
