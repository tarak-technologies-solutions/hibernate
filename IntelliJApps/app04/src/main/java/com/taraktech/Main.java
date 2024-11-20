package com.taraktech;

import com.taraktech.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
       // configuration.configure();
        FileInputStream fis = new FileInputStream("E:\\HibernateApps\\IntelliJApps\\app04\\src\\main\\resources\\abc.properties");
        Properties properties = new Properties();
        properties.load(fis);
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = (Employee) session.get(Employee.class,111);
        System.out.println("Employee Details.............");
        System.out.println("Employee Number       : "+employee.getEno());
        System.out.println("Employee Name         : "+employee.getEname());
        System.out.println("Employee Salary       : "+employee.getEsal());
        System.out.println("Employee Address      : "+employee.getEaddr());
        session.close();
        sessionFactory.close();

    }
}