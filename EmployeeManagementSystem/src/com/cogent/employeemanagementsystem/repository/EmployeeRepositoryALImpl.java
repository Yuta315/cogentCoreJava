package com.cogent.employeemanagementsystem.repository;


import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	//Singleton DP.
	
	public static void main(String[] args) {
		Thread thread = new Thread(()-> {
			EmployeeRepository employeeRepository2 = EmployeeRepositoryALImpl.getInstance();
			System.out.println(employeeRepository2.hashCode());
			
		});
		
		thread.start();
		Thread thread2 = new Thread(()-> {
			EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
			System.out.println(employeeRepository.hashCode());
			
		});
	
		thread2.start();
	}
	
	
private static EmployeeRepository employeeRepository;

	private EmployeeRepositoryALImpl()
	{
		
	}

	public static EmployeeRepository getInstance()
//	public synchronized static EmployeeRepository getInstance()
	{
//		if(employeeRepository == null)
//		{
//			employeeRepository = new EmployeeRepositoryALImpl();
//			return employeeRepository;
//		}
//		return employeeRepository;
		
//		under this synchronized edition
		if(employeeRepository == null) {
			
			synchronized (EmployeeRepositoryALImpl.class) {
				if(employeeRepository == null) {
					employeeRepository = new EmployeeRepositoryALImpl();
					return employeeRepository;
				}
			}
		}
		return employeeRepository;
		
	}
	
//	private ArrayList<Employee> employees = new ArrayList<>();
//	private List<Employee> employees = new ArrayList<>();
//	private List<Employee> employees = new LinkedList<>();
	private Set<Employee> employees = new HashSet<>();
//	16 employees
//	private Set<Employee> employees = new LinkedHashSet<>();

	
	
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
		Employee employee = this.getEmployeeById(id);
		
		if(employee != null)
		{
			boolean status = employees.remove(employee);
			if(status)
			{
				return "Success";
			}
		}
		return "Not Found";
//		return null;
	}

	@Override
	public void deleteAllEmployees() throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		// delete all employees from AL.
		employees.clear();
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
//	public Employee[] getEmployees() {
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
//		AL => array
//		Employee employee[] = new Employee[employees.size()];
//		set ===> List.
		
//		return employees.toArray(employee);
//		return employees;
		return new ArrayList<>(employees);

//		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees)
		{
			if(id.equals(employee.getEmployeeId()))
			{
				return true;
			}
		}
		return false;
	}

}
