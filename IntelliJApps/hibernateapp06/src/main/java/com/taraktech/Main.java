package com.taraktech;


import com.taraktech.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory
                (new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setEname("Tarak");
        employee.setEsal(60000f);
        employee.setEaddr("CVM");

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}