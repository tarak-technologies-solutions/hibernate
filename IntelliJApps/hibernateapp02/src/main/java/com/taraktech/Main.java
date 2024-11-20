package com.taraktech;

import com.taraktech.entities.Employee;
import com.taraktech.service.EmployeeService;
import com.taraktech.service.EmployeeServiceImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = null;
        BufferedReader bufferedReader = null;

        try {
            Integer eno = 0;
            String ename ="";
            Float esal =0.0f;
            String eaddr = "";
            Employee employee = null;
            while (true){
                System.out.println("1 Add");
                System.out.println("2 Search");
                System.out.println("3 Delete");
                System.out.println("4 Update");
                System.out.println("5 Exit");
                bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your option    : ");
                Integer userOption = Integer.parseInt(bufferedReader.readLine());
                switch (userOption){
                    case 1 :
                        System.out.println("Employee insertion........");

                        System.out.print("Enter the employee number     : ");
                        eno = Integer.parseInt(bufferedReader.readLine());
                        employeeService = new EmployeeServiceImpl();
                        employee = employeeService.employeeSearch(eno);

                        if (employee == null){


                            System.out.print("Enter the employee name       : ");
                            ename = bufferedReader.readLine();
                            System.out.print("Enter the employee salary     : ");
                            esal = Float.parseFloat(bufferedReader.readLine());
                            System.out.print("Enter the employee address    : ");
                            eaddr = bufferedReader.readLine();

                            employee = new Employee();
                            employee.setEno(eno);
                            employee.setEname(ename);
                            employee.setEsal(esal);
                            employee.setEaddr(eaddr);

                            String status = employeeService.employeeAdd(employee);
                            System.out.println(status);

                        }else {
                            System.out.println("Employee already exits......");
                        }
                        break;
                    case 2 :
                        System.out.print("Employee search module......");
                        System.out.println();
                        System.out.print("Enter employee number      : ");
                        Integer emloyeeNumber = Integer.parseInt(bufferedReader.readLine());
                        System.out.println(emloyeeNumber);

                        employeeService = new EmployeeServiceImpl();
                        Employee searchEmployee = employeeService.employeeSearch(emloyeeNumber);

                        System.out.println("Employee Number   : "+searchEmployee.getEno());
                        System.out.println("Employee Name     : "+searchEmployee.getEname());
                        System.out.println("Employee Salary   : "+searchEmployee.getEsal());
                        System.out.println("Employee Address  : "+searchEmployee.getEaddr());
                        break;
                    case 3 :
                        break;
                    case 4 :
                        break;
                    case 5 :
                        break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}