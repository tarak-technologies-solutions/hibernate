package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class HQL_2Column_select {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	
		String hql="select name,email from Employee";
		Query q=session.createQuery(hql);	
		List<Object> list=	q.list();
		for(Object o:list)
		{
			Object ar[]=(Object[])o;
			System.out.println(ar[0]);
			System.out.println(ar[1]);
				
		}
		session.close();
		sf.close();
	}
}
