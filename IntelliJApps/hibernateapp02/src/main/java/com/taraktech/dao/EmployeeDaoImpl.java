package com.taraktech.dao;

import com.taraktech.entities.Employee;
import com.taraktech.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public String add(Employee employee) {

        String status ="";
        Transaction transaction = null;

       try {

           SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
           Session session = sessionFactory.openSession();
           transaction = session.beginTransaction();
           Integer pkVal = (Integer) session.save(employee);
           if (pkVal.equals(employee.getEno())){
               transaction.commit();
               status = "SUCCESS";
           }else {
               transaction.rollback();
               status="FAILURE";
           }


       }catch (Exception e){

           transaction.rollback();
           status="FAILURE";
           e.printStackTrace();
       }

        return status;
    }

    @Override
    public Employee search(Integer eno) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = (Employee) session.get(Employee.class,eno);
        return employee;
    }

    @Override
    public Employee delete(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }
}
