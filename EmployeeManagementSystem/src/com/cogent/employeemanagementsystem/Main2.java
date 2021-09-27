package com.cogent.employeemanagementsystem;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main2 {

	public static void main(String[] args)
	{
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		try {
			Employee employee = employeeService.getEmployeeById("Yuta001");
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// will terminate execution because it went from checked exception to unchecked exception
		// if throws used inside main it terminates execution.
		
		
		
	}
}
