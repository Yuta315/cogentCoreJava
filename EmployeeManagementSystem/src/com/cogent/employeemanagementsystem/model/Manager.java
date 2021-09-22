package com.cogent.employeemanagementsystem.model;


public class Manager extends Employee {

	private String managerId;
	private float projectAllow;

	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public float getProjectAllow() {
		return projectAllow;
	}
	public void setProjectAllow(float projectAllow) {
		this.projectAllow = projectAllow;
	}
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary();
	}	
	public Manager() {
		// TODO Auto-generated constructor stub
//		System.out.println("Hello from manager default constructor");
		this("", "", "", 1000.0f, 1000.0f, "");
//		to another constructor from the same class.
		
	}
	
	public Manager(String empId, String firstName, String lastName, 
			float empSalary, float projectAllow,
			String managerId)
	{
		super(empId, firstName, lastName, empSalary);// it will give a call to constructor from parent class
		
		this.projectAllow = projectAllow;
		this.managerId = "manager";
		
		
	}
}
