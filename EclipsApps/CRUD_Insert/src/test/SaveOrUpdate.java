package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveOrUpdate {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		//create student object
		Student st=new Student();
		st.setId(222);
		st.setName("lmn");
		st.setEmail("lmn@ymail.com");
		st.setAddress("hyd");
		
		
		session.saveOrUpdate(st);
	
		
		t.commit();//data will execute here
		session.close();
		sf.close();
		System.out.println("data insertion success");
		
		
	}
}
