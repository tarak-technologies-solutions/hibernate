package com.taraktech.dao;

import com.taraktech.entities.Employee;

public interface EmployeeDao {
    public String add(Employee employee);
    public Employee search(Integer eno);
    public Employee delete(Employee employee);
    public Employee update(Employee employee);
}
