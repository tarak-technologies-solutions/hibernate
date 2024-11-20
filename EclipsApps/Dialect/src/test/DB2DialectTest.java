package test;

import org.hibernate.cfg.Configuration;

public class DB2DialectTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/db2.cfg.xml");
	cfg.buildSessionFactory();
	
	
	
}
}
