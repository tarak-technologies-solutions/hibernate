package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
public static void main(String[] args) {
	try{
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	System.out.println("DDL create execution successfull");
	
	try{
		Thread.sleep(1000*15);
		
	}catch(Exception e){}
	
	
	sf.close();
	System.out.println("drop all tables");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
}
}
