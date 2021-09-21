package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {

	private static EmployeeService employeeService;
	private EmployeeService()
	{
		
	}
	public static EmployeeService getInstance()
	{
		if(employeeService == null)
		{
			employeeService = new EmployeeService();
			return employeeService;
		}
		return employeeService;
	}

	
	EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
//	are we consuming the repo?
	
	
	
	public String addEmployee(Employee employee)
	{
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee getEmployeeById(String id)
	{
		return employeeRepository.getEmployeeById(id);
	}
}
