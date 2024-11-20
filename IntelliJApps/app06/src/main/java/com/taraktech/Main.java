package com.taraktech;

import com.taraktech.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employee employee = new Employee();
        employee.setEno(222);
        employee.setEname("Amar");

        Employee emp = (Employee) session.get(Employee.class,employee);

        System.out.println("Employee Details.........................");
        System.out.println("Employee Number       : "+emp.getEno());
        System.out.println("Employee Name         : "+emp.getEname());
        System.out.println("Employee Salary       : "+emp.getEsal());
        System.out.println("Employee Address      : "+emp.getEaddr());

        session.close();
        sessionFactory.close();

    }
}