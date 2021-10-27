package com.cogent.emsmongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.emsmongodb.dto.Employee;
import com.cogent.emsmongodb.repository.EmployeeRepository;

@Service
//@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
/*	private static EmployeeService employeeService;
	
	private EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	
	public static EmployeeService getInstance() {
		if(employeeService == null) {
			employeeService = new EmployeeServiceImpl();
			return employeeService;
		}
		return employeeService;
	}
	
	private EmployeeServiceImpl() {
		
	}
*/
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAllEmployees();
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployee(id, employee);
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.isEmployeeExists(id);
	}

}
