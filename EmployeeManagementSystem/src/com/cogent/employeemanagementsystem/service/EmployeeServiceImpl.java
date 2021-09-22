package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
//	are we consuming the repo?
	
//	loose coupling : 
	
	private static EmployeeService employeeService;
	private EmployeeServiceImpl()
	{
		
	}
	public static EmployeeService getInstance()
	{
		if(employeeService == null)
		{
			employeeService = new EmployeeServiceImpl();
			return employeeService;
		}
		return employeeService;
	}

	
//	EmployeeRepositoryImpl employeeRepository = EmployeeRepositoryImpl.getInstance();

	
	
	
	public String addEmployee(Employee employee)
	{
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee getEmployeeById(String id)
	{
		return employeeRepository.getEmployeeById(id);
	}
	
	public Employee[] getEmployees()
	{
		return employeeRepository.getEmployees();
	}
	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
