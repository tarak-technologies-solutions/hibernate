package test;

import org.hibernate.cfg.Configuration;

public class OracleDialectTest {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	cfg.buildSessionFactory();
	
	
	
}
}
