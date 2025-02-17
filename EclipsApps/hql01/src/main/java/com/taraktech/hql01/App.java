package com.taraktech.hql01;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.taraktech.hql01.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configure = new Configuration().configure();
    	SessionFactory sessionFactory = configure.buildSessionFactory
    			(new StandardServiceRegistryBuilder().applySettings(configure.getProperties()).build());
    	Session session = sessionFactory.openSession();
    	
    	Query query = session.createQuery("from Employee");
    	List<Employee> list = query.list();
    	System.out.println("Using list() method ...............");
    	for (Employee employee : list) {
			System.out.print(employee.getEno()+"\t");
			System.out.print(employee.getEname()+"\t\t");
			System.out.print(employee.getEsal()+"\t\t");
			System.out.print(employee.getEaddr()+"\n");
		}
    	System.out.println("Using Iterator.................");
    	Iterator<Employee> iterator = query.iterate();
    	while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.print(employee.getEno()+"\t");
			System.out.print(employee.getEname()+"\t\t");
			System.out.print(employee.getEsal()+"\t\t");
			System.out.print(employee.getEaddr()+"\n");
		}
    	session.close();
    	sessionFactory.close();
    }
}
