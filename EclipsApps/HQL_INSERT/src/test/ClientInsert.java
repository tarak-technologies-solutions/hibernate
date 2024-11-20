package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class ClientInsert {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	
	OldStudent os1=new OldStudent(111, "abc", "abc@gmail.com", "hyd");
	OldStudent os2=new OldStudent(222, "lmn", "lmn@gmail.com", "hyd");
	OldStudent os3=new OldStudent(333, "xyz", "xyz@gmail.com", "hyd");
	
	
	session.save(os1);
	session.save(os2);
	session.save(os3);
	transaction.commit();
	session.close();
	sf.close();
	
	
}
}
