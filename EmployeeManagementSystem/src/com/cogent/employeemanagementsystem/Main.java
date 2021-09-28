package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
	
//	Day6 Lecture new class
	public static int division(int a, int b)
	{
		int c = 0;
		try {
			c = a / b; // it will create an object of arithmetic exception.
			// JVM will implicitly create the objects for all pre defined runtime exceptions.
			return c; // if division is done then return the result.
		}
		catch (ArithmeticException e) {
			// TODO: handle exception

		}
		finally {
			System.out.println("inside the finally block"); // finally block code
		}

		return -1;

	}
	
	
	public static void main(String[] args)
	{
//		FileOutputStream fileOutputStream;
//		try {
//			fileOutputStream = new FileOutputStream("abc.txt");
//			fileOutputStream.write("Yuta".getBytes());
//		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
//		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", 315.00f);
		String result = null;
		try {
//			employee.setEmpSalary(5000.0f);
			result = employeeService.addEmployee(new Employee("Yuta001", "Yuta", "Mogi", 315.00f));
			System.out.println(result);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if("Success".equals(result))
		{
			System.out.println("Employee added successfully");
		}
		
		

	}
	

//	public static void main(String[] args)
//	{
//		Day 6 lecture
//		int result = division(10,0);
		
//		System.out.println(result);
//		until here for Day 6 lecture first part. There is more Day6 topic bottom of this method.
		
		
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
		
////		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
//		Employee employee = new Employee("Yu001", "Yuta", "Mogi", 123.0f, "PA");
////		Employee employee = new Employee("Yu001", "Yuta", "Mogi", 123.0f);

		
////		String result = employeeService.addEmployee(employee);
		
////		System.out.println(result);
		
////		Employee[] employees = employeeService.getEmployees();
		
		
		
////		for (Employee employee2 : employees)
////		{
////			System.out.println(employee2);
////		}
		
//		Employee[] employee4 = employeeService.getEmployeesByName("Yuta");

////		employeeService.deleteAllEmployees();
////		employeeService.getEmployeesByName("Yuta");
////		employeeService.updateEmployee("Yuta", employee);
		
		
		
		
//		From here Day6 lecture exception handling
		
//		Scanner input = new Scanner(System.in);
//		in ===> static Ref ===> used with className.

//		it is used to accept the value / data from user
//		System.out.println("Enter the data");
//		int c = 0, a = 0, b = 0;
//		try {
//			a = input.nextInt();
			
//			b = input.nextInt();
			
			
//			System.out.println(a);
//			System.out.println(b);
//			c = a / b;
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("exception occured");
//			System.out.println("enter the value for b again");
//			b = input.nextInt();
//			c = a / b;
//			you will give 3 attempts to provide a non zero value for b.
			
//		}
//		finally
//		{
//			System.out.println("inside the finally block");
//		}
//		System.out.println("division is " + c);
		
		
//		try { // 10 statements 
//			System.out.println(10/5);
//			String s = null;
//			System.out.println(s.concat("Yuta")); // s is holding that means
			// s is not referring to object to call concat method we need object
			// since object is not there and we are trying to call concat method then it will throw NPE.

//		} // extreme child to top 
//		catch (ArithmeticException e) {
			// TODO: handle exception
//		}
//		catch (NullPointerException e) {
			// TODO: handle exception
//		}
//		catch (RuntimeException e) {
			// TODO: handle exception
//		}
		
//		catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Exception caught");
//			System.out.println(e.getClass().getName());
//		}
//		catch (Throwable e) {
			// TODO: handle exception
//		}
		// Why no for object if object is able to handle it 
		// then every class is capable to handle the exception
		// then what is diff between a normal class and exceptional class?
		
//		catch (Object e) {
//			// TODO: handle exception
//		}
//		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
//		try {
//			Employee employee = employeeService.getEmployeeById("Yuta001");
//		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	// will terminate execution because it went from checked exception to unchecked exception
	// if throws used inside main it terminates execution.
		
	
	
//	}
}
