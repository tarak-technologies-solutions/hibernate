package com.taraktech;


import com.taraktech.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory
                (new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        Session session = sessionFactory.openSession();

        Employee employee = (Employee) session.get(Employee.class,111);

        System.out.println("Employee Details.............................");
        System.out.println("Employee NUmber      : "+employee.getEno());
        System.out.println("Employee Name        : "+employee.getEname());
        System.out.println("Employee Salary      : "+employee.getEsal());
        System.out.println("Employee Address     : "+employee.getEaddr());

        session.close();
        sessionFactory.close();
    }
}