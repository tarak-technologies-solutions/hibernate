package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction t=ses.beginTransaction();
	
	
	Student st=new  Student();
	st.setId(111);
	st.setName("abc");
	st.setEmail("abc@gmail.com");
	st.setAddress("hyd");
	ses.save(st);
	t.commit();
	
}
}
