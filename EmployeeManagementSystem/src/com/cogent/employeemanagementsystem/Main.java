package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;


public class Main {

	public static void main(String[] args)
	{
//		Employee employee = new Employee();
//		Employee employee3 = null;
//		int a = 10;
//		System.out.println(a);
//		ClassName reference = object
//		Employee employee2 = new Employee("ab001", "abhi", "chivate", 100.0f, "PA");
		
//		System.out.println(employee2.getEmployeeId());
//		System.out.println(employee3.getAddress());
		
//		Employee employees[] = new Employee[10];
//		for(int i = 0; i < employees.length; i++)
//		{
//			employees[i] = new Employee();
//		}
//		for(Employee employee4 : employees)
//		{
			
//			System.out.println(employee4);
//		}

//		can u write a switch case to handle all options?
//		1. add
//		2. getEmp by id
//		3. delete
//		4. update
//		5. getall
//		6. exit
		
//		EmployeeService employeeService = new EmployeeService();
		
		EmployeeService employeeService = EmployeeService.getInstance();
		
		Employee employee = new Employee("Yu001", "Yuta", "Mogi", 123.0f, "PA");
		
		String result = employeeService.addEmployee(employee);
		
		System.out.println(result);
		
		Employee[] employees = employeeService.getEmployees();
		
		for (Employee employee2 : employees)
		{
			System.out.println(employee2);
		}
		
	}
}
