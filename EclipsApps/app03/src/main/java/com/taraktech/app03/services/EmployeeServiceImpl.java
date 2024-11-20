package com.taraktech.app03.services;

import com.taraktech.app03.dao.EmployeeDao;
import com.taraktech.app03.dao.EmployeeDaoImpl;
import com.taraktech.app03.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String addEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		String status = employeeDao.add(employee);
		return status;
	}

	@Override
	public Employee searchEmployee(Integer eno) {
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		Employee employee = employeeDao.search(eno);
		
		return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		String status = employeeDao.update(employee);
		return status;
	}

	@Override
	public String deleteEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		String status = employeeDao.delete(employee);
		return status;
	}

}
