package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new  Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
			
	Student st1=new  Student(1, "a", "a@gmail.com", 500);
	Student st2=new  Student(2, "b", "b@gmail.com", 501);
	Student st3=new  Student(3, "c", "c@gmail.com", 502);
	Student st4=new  Student(5, "d", "d@gmail.com", 503);
	Student st5=new  Student(6, "e", "e@gmail.com", 504);
	Student st6=new  Student(7, "f", "f@gmail.com", 505);
	Student st7=new  Student(8, "g", "g@gmail.com", 506);
	Student st9=new  Student(9, "h", "h@gmail.com", 507);
	Student st10=new  Student(10, "i", "i@gmail.com", 508);
	Student st11=new  Student(11, "j", "j@gmail.com", 509);
	Student st12=new  Student(12, "k", "k@gmail.com", 510);
	Student st13=new  Student(13, "l", "l@gmail.com", 511);
		s.save(st1);
		s.save(st2);
		s.save(st3);
		s.save(st4);
		s.save(st5);
		s.save(st6);
		s.save(st7);
		s.save(st9);
		s.save(st10);
		s.save(st11);
		s.save(st12);
		s.save(st13);
		s.flush();
		s.beginTransaction().commit();
		
}
}
