package com.taraktech.utility;

import com.taraktech.service.EmployeeService;
import com.taraktech.service.EmployeeServiceImpl;

public class EmployeeServiceUtil {

    private static EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImpl();
    }

    public static EmployeeService getEmployeeService() {
        return employeeService;
    }
}
