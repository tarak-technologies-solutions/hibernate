package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class CLient {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	Student st=new Student(222, "lmn", "lmn@gmail.com");
	
	session.save(st);
	t.commit();
	session.close();
	sf.close();
	System.out.println("save success");
	
	
}
}
