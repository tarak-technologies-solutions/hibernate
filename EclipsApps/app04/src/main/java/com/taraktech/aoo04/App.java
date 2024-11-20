package com.taraktech.aoo04;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.taraktech.aoo04.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
       
        Employee employee = (Employee) session.get(Employee.class, 111);
        System.out.println("Employee Details............................");
        System.out.println(employee.getEno());
        System.out.println(employee.getEname());
        System.out.println(employee.getEsal());
        System.out.println(employee.getEaddr());
        session.close();
        sessionFactory.close();
    }
}
