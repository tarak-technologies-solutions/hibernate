package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	
	SEmployee se=new SEmployee(111, "abc", "abc@gmail.com", 50000, "hibernate");
	HEmployee he=new HEmployee(222, "lmn", "lmn@gmail.com", 40000, 10);
	Admin a=new Admin(333, "aaa", "aaa@gmail.com", 60000, "SRNAGAR");

	session.save(se);
	session.save(he);
	session.save(a);
	transaction.commit();
	session.close();
	sf.close();
	
	
	
	
	
}
}
