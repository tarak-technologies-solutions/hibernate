package com.taraktech.service;

import com.taraktech.entities.Employee;

public interface EmployeeService {

    public String employeeAdd(Employee employee);
    public Employee employeeSearch(Integer eno);
    public Employee employeeDelete(Employee employee);
    public Employee employeeUpdate(Employee employee);

}
