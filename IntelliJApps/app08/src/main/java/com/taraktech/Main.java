package com.taraktech;

import com.taraktech.entities.Employee;
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
        employee.setEname("Pardhu");
        employee.setEsal(3000f);
        employee.setEaddr("NRT");
        session.persist(employee);
        transaction.commit();
        session.close();
        sessionFactory.close();;
    }
}

