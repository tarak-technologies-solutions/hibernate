package com.taraktech.app02;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.taraktech.app02.entities.Employee;
import com.taraktech.app02.utilities.HibernateUtility;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
       Session session = sessionFactory.openSession();
       
       /*Employee employee = new Employee();
       employee.setEno(111);
       */
       Employee emp = (Employee) session.load(Employee.class, 444);
       
       System.out.println("Employee details....");
       System.out.println("---------------------------------------");
       System.out.println("Employee Number : "+emp.getEno());
       System.out.println("Employee Name : "+emp.getEname());
       System.out.println("Employee Salary : "+emp.getEsal());
       System.out.println("Employee Address : "+emp.getEaddr());
       
       session.close();
       sessionFactory.close();
    }
}
