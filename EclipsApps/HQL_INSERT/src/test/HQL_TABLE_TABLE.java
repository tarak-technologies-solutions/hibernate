package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class HQL_TABLE_TABLE {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		String hql = "insert into NewStudent(id,name,email,address) select s.id,s.name,s.email,s.address from OldStudent s";

		Query q = session.createQuery(hql);

		int i=q.executeUpdate();
		System.out.println("no rows dumped from old to new table"+i);
		
		
		session.close();
		sf.close();

	}
}
