package com.taraktech.app02.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration();
		configuration.configure("mysql_connection.xml");
		 sessionFactory = configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
