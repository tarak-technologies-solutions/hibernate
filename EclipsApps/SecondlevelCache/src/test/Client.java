package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("using first session");
		
		Student st1 = (Student) session.get(Student.class, 10);
			System.out.println(st1.getSname());
			System.out.println(st1.getSemail());

		Student st2 = (Student) session.get(Student.class, 10);
		System.out.println(st2.getSname());
		System.out.println(st2.getSemail());

		
		System.out.println("using second session");
		
		Session session2=sf.openSession();
		
		
		
		Student st3 = (Student) session2.get(Student.class, 10);

		System.out.println(st3.getSname());
		System.out.println(st3.getSemail());
	
	
	
	
	
	
	
	
	}
	
}
