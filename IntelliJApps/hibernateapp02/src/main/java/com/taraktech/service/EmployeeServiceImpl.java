package com.taraktech.service;

import com.taraktech.dao.EmployeeDao;
import com.taraktech.dao.EmployeeDaoImpl;
import com.taraktech.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public String employeeAdd(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        String status = employeeDao.add(employee);
        return status;
    }

    @Override
    public Employee employeeSearch(Integer eno) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = employeeDao.search(eno);
        return employee;
    }

    @Override
    public Employee employeeDelete(Employee employee) {
        return null;
    }

    @Override
    public Employee employeeUpdate(Employee employee) {
        return null;
    }
}
