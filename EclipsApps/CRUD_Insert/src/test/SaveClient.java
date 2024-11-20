package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveClient {
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
		
		
		int pk=(Integer)session.save(st);
		
		System.out.println(pk);
		
		t.commit();//data will execute here
		session.close();
		sf.close();
		System.out.println("data insertion success");
		
		
	}
}
