package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction t=ses.beginTransaction();
	
	
	Student st=new  Student();
	st.setId(222);
	st.setName("lmn");
	st.setEmail("lmn@gmail.com");
	st.setAddress("hyd");
	ses.save(st);
	t.commit();
	
}
}
