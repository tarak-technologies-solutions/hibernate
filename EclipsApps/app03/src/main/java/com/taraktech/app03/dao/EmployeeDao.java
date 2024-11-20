package com.taraktech.app03.dao;

import com.taraktech.app03.entities.Employee;

public interface EmployeeDao {
	public String add(Employee employee);
	public Employee search(Integer eno);
	public String update(Employee employee);
	public String delete(Employee employee);
}
