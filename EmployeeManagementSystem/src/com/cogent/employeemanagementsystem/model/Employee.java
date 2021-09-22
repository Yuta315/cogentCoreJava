package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public final class Employee {
	
	public final float calculateSalary()
	{
		return empSalary + 500;
	}
	

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
	}
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	public Employee()
	{
		this.employeeId = "";
		System.out.println("Hello from employee default constructor");
		// explicit default constructor
	
		
	}
	
//	  public Employee(String employeeId, String firstName, String lastName, float empSalary)
//	  {
//		  super();
//		  this.employeeId = employeeId;
//		  this.firstName = firstName;
//		  this.lastName = lastName;
//		  this.empSalary = empSalary;
//	  }

	
	
	
}
