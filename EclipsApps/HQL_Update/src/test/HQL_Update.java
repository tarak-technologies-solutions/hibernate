package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class HQL_Update {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	//String hql="update Student set name='ABC',email='ABC@yahoo.com' where id=111";
	//String hql="update Student set id=555 where id=111";
	String hql="update Student set email='ABC@ymail.com' where id=555";
	Query query=session.createQuery(hql);
	int i=query.executeUpdate();
	t.commit();
	System.out.println(i);
	session.close();
	sf.close();
}
}
