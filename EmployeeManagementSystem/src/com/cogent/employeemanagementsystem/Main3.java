package com.cogent.employeemanagementsystem;

import java.util.Set;
import java.util.*;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;

public class Main3 {

	public static void main(String[] args)
	{
//		Employee employee = new Employee();
		Employee employee = null;
		
		try {
//			employee.setEmpSalary(5000.0f);
			employee = new Employee("Yuta001", "Yuta", "Mogi", 315.00f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(employee.hashCode());
		
//		Employee employee2 = new Employee();
		Employee employee2 = null;
		try {
//			employee.setEmpSalary(5000.0f);
			employee2 = new Employee("Yuta001", "YutaDayo", "Mogi", 3150.00f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Employee employee3 = new Employee();
		Employee employee3 = null;
		try {
//			employee.setEmpSalary(5000.0f);
			employee3 = new Employee("Yuta002", "Yuta", "", 31500.00f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(employee.hashCode());
		
//		System.out.println(employee.equals(employee2));
//		System.out.println(employee2.equals(employee3));
//		System.out.println(employee3.equals(employee));
		
//		System.out.println(employee.equals(null));
//		System.out.println(employee2.equals(null));
//		System.out.println(employee3.equals(null));
		
//		System.out.println(employee.hashCode());
//		System.out.println(employee2.hashCode());
//		System.out.println(employee3.hashCode());
		System.out.println(Integer.toHexString(employee.hashCode()));
		System.out.println(Integer.toHexString(employee2.hashCode()));
		System.out.println(Integer.toHexString(employee3.hashCode()));
		
//		System.out.println("Yuta".equals(2500));
//		Set<Employee> employees = new HashSet<>();
		Set<Employee> employees = new LinkedHashSet<>();

		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		for(Employee employee4 : employees) {
			System.out.println(employee4);
		}
	}
}
