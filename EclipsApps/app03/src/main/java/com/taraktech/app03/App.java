package com.taraktech.app03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taraktech.app03.entities.Employee;
import com.taraktech.app03.services.EmployeeService;
import com.taraktech.app03.services.EmployeeServiceImpl;

public class App {
	public static void main(String[] args) {

		EmployeeService employeeService = null;
		BufferedReader bufferedReader = null;
		try {

			while (true) {
				System.out.println("Employee Options........");
				System.out.println("1 Add");
				System.out.println("2 Search");
				System.out.println("3 Update");
				System.out.println("4 Delete");
				System.out.println("5 Exit");

				Integer eno = 0;
				String ename = "";
				Float esal = 0.0f;
				String eaddr = "";

				bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter user option     : ");
				Integer userOption = Integer.parseInt(bufferedReader.readLine());
				/*
				 * System.out.print("Enter employee     : "); eno =
				 * Integer.parseInt(bufferedReader.readLine());
				 */
				switch (userOption) {
				case 1:

					System.out.println("Enter employee number         : ");
					eno = Integer.parseInt(bufferedReader.readLine());
					employeeService = new EmployeeServiceImpl();
					Employee employee = employeeService.searchEmployee(eno);
					if (employee == null) {

						System.out.print("Enter employee name       : ");
						ename = bufferedReader.readLine();
						System.out.print("Enter employee salary     : ");
						esal = Float.parseFloat(bufferedReader.readLine());
						System.out.print("Enter employee address    : ");
						eaddr = bufferedReader.readLine();

						Employee employee2 = new Employee();

						employee2.setEno(eno);
						employee2.setEname(ename);
						employee2.setEsal(esal);
						employee2.setEaddr(eaddr);

						String status = employeeService.addEmployee(employee2);
						System.out.println("Status    :  " + status);

					} else {
						System.out.println("Employee already exits..........");
					}

					break;
				case 2:

					System.out.println("Enter employee number    : ");
					Integer searchValue = Integer.parseInt(bufferedReader.readLine());
					employeeService = new EmployeeServiceImpl();
					Employee employee1 = employeeService.searchEmployee(searchValue);

					System.out.println("Employee Number      : " + employee1.getEno());
					System.out.println("Emloyee Name         : " + employee1.getEname());
					System.out.println("Employee Salary      : " + employee1.getEsal());
					System.out.println("Employee Address     : " + employee1.getEaddr());
					System.out.println();

					break;
				case 3:

					System.out.println("Enter the employee number...........");
					Integer empNum = Integer.parseInt(bufferedReader.readLine());
					employeeService = new EmployeeServiceImpl();
					Employee updateEmployee = employeeService.searchEmployee(empNum);
					if (!(updateEmployee == null)) {
						
						/*
						System.out.println("Enter employee number         : ");
						Integer empNum = Integer.parseInt(bufferedReader.readLine());
						*/
						System.out.println("Enter employee name           : ");
						String empName = bufferedReader.readLine();
						System.out.println("Enter employee salary         : ");
						Float empSal = Float.parseFloat(bufferedReader.readLine());
						System.out.println("Enter employee address        : ");
						String empAddress = bufferedReader.readLine();
						
						
						Employee employee2 = new Employee();
						employee2.setEno(empNum);
						employee2.setEname(empName);
						employee2.setEsal(empSal);
						employee2.setEaddr(empAddress);
						
						String status = employeeService.updateEmployee(employee2);
						System.out.println("Update status    : "+status);
					} else {
						System.out.println("Employee does't exits.........");
					}

					break;
				case 4:

					System.out.println("Enter employee number      : ");
					Integer empNumD = Integer.parseInt(bufferedReader.readLine());
					employeeService = new EmployeeServiceImpl();
					Employee employee3 = employeeService.searchEmployee(empNumD);
					
					if (!(employee3 == null)) {
						String status = employeeService.deleteEmployee(employee3);
						System.out.println(status);
					}else {
						System.out.println("Employee does't exits.......");
					}
					
					break;
				case 5:
					System.out.println("Thank you for using employee service............");
					System.exit(0);
					break;

				default:
					System.out.println("Invalide Option.........");
					System.out.println();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
