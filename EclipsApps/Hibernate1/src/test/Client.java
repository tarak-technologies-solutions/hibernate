package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Student st=new Student();
	st.setId(111);
	st.setName("abc");
	st.setEmail("abc@gmail.com");
	st.setMarks(500);
	//student object state is transiant
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	s.save(st);
	//student object state is persistant
	s.beginTransaction().commit();
	//student object will move database
	s.evict(st);
	//student object detached state
	//student object will be remove from perstatnt 
	//then gc can collect ur student object	
}
}
