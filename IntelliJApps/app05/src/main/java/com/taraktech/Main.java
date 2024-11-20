package com.taraktech;

import com.taraktech.entities.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;



public class Main {
    public static void main(String[] args)   {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory =  configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setEno(111);
        employee.setEname("Tarak");
        employee.setEsal(60000.0f);
        employee.setEaddr("CVM");

        Employee employee1 = new Employee();
        employee1.setEno(222);
        employee1.setEname("Amar");
        employee1.setEsal(100000f);
        employee1.setEaddr("CVM");

        session.save(employee);
        session.save(employee1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}