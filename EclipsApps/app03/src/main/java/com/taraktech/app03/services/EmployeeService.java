package com.taraktech.app03.services;

import com.taraktech.app03.entities.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public Employee searchEmployee(Integer eno);
	public String updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);
}
