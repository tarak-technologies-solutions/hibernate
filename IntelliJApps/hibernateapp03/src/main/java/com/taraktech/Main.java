package com.taraktech;

import com.taraktech.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws Exception{

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("Session factory creating..........");

        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCid(111);
        customer.setCname("Tarak");
        customer.setCaddr("CVM");
        customer.setCmobile(9160925178l);

        session.persist(customer);
        transaction.commit();
        System.out.println("Customer create successfully...........");

        session.close();
        System.in.read();
        sessionFactory.close();
        System.out.println("Session factory closing.........");
    }
}