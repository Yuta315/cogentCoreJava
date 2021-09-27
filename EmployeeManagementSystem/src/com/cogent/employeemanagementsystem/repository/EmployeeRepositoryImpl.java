package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Employee employees[] = new Employee[10];
	
//	private static EmployeeRepositoryImpl employeeRepository;
	private static EmployeeRepository employeeRepository;

	
	private EmployeeRepositoryImpl()
	{
//		TODO Auto-generated constructor stub
		
	}
	
//	public static EmployeeRepositoryImpl getInstance()
	public static EmployeeRepository getInstance()
	{
		if(employeeRepository == null)
		{
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	static int counter = 0;
	public String addEmployee(Employee employee)
	{
//		do we need to maintain the index for an employees array?
	
		if(counter >= employees.length)
		{	
			return "array is full";
		}
		
		employees[counter++] = employee;
		return "Success";
	}
//	this method should give us employee details on the basis of id
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException
	{
		for(Employee employee : employees)
		{
			if(employee != null && id.equals(employee.getEmployeeId()))
			{
				return employee;
			}
		}
		
//		return null;
		
		// IdNot found Exception?
		throw new IdNotFoundException("ID not found");
		
	}
	
	public Employee[] getEmployees()
	{
		return employees;
	}
	
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException
	{
//		1. that id exists or not.
		Employee employee = this.getEmployeeById(id);

		if(employee != null)
		{
//			record found
//			we need to set null
			int index = this.getIndex(employee);
			
			if(index != -1)
			{
//				record found
				employees[index] = null;
				return "Success";
				
//				we need to set null;
			}
		}
		else
		{
//			return "not found";
			throw new IdNotFoundException("ID not found");
		}
//		2. id exists then set null to location?
//		if return not found
		
//		return "not found";
		throw new IdNotFoundException("ID not found");
		
	}
	
	private int getIndex(Employee employee)
	{
		for(int i = 0; i < employees.length; i++)
		{
			if(employees[i].equals(employee))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employees = null;
	}
	
	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub

		this.getEmployeeById(id);
		
//		this.getIndex(employee);
		
		int index = this.getIndex(employee);
		employees[index] = employee;
		
		return "Success";
		
//		return null;
	}
	
	private static int index = 0;
	public Employee[] getEmployeesByName(String name)
	{
		Employee[] employeesTemp = new Employee[employees.length];
		
		for(Employee employee : employees)
		{
			if(employee.getFirstName().equals(name))
			{
				employeesTemp [index++] = employee;
				
			}
		}
		return employeesTemp;
	}
	
}
