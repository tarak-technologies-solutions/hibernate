package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class PersistClient {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		//create student object
		Student st=new Student();
		st.setId(111);
		st.setName("abc");
		st.setEmail("abc@gmail.com");
		st.setAddress("hyd");
		
		
		session.persist(st);
		//save can execute with out transaction boundary's
		//persist can execute with in transaction boundary's
			
		t.commit();//data will execute here
		session.close();
		sf.close();
		System.out.println("data insertion success");
		
		
	}
}
