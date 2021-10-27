package com.cogent.emsmongodb.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.emsmongodb.dto.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Optional<Employee> getEmployeeById(String id);
	public Optional<List<Employee>> getEmployees();
	public String updateEmployee(String id, Employee employee);
	public boolean isEmployeeExists(String id);
}
