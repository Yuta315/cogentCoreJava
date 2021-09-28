package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	//Singleton DP.

	private EmployeeRepositoryALImpl()
	{
		
	}

private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance()
	{
		if(employeeRepository == null)
		{
			employeeRepository = new EmployeeRepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	private ArrayList<Employee> employees = new ArrayList<>();
//	10 employees
//	when we will add 11th one then it will increase the size automatically.
//	self growable.
//	<Employee> ===> we are informing that we will hold only Employee type objects.
//	int newCapacity = oldcapacity + (oldcapacity >> 1);
	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		boolean status = employees.add(employee);
		
		if(status)
		return "Sucess";
		else
			return "Fail";
			
//		return null;
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		
//		1. We need to traverse the arrayList.
		
		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId()))
				return employee;
//			System.out.println(employee);
		}
//		2. We need to use java 8 features.
		
		return null;
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
