package com.taraktech.utility;

import com.taraktech.dao.EmployeeDao;
import com.taraktech.dao.EmployeeDaoImpl;

public class EmployeeDaoUtil {

    private static EmployeeDao employeeDao;

    static {
        employeeDao = new EmployeeDaoImpl();
    }

    public static EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
