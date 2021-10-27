package com.cogent.emsmongodb;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cogent.emsmongodb.dto.Employee;
import com.cogent.emsmongodb.service.EmployeeService;
import com.cogent.emsmongodb.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
		Scanner scanner = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1998);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 15);
//		Date dateRepresentation = cal.getTime();
//		Date test = new Date(cal.toString());
		Date dobs = new Date(1998, 3, 15); // new Date(year - 1900, month - 1, day);
		
//		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", new Date(), new Date(1998, 3, 15), 1500.0f);
		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", new Date(), new Date(1998 - 1900, 3 - 1, 15), 1500.0f);
//		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", new Date(), new Date(cal.toString()), 1500.0f);
//		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", new Date(), LocalDate.of(1998, 3, 15), 1500.0f);
		Employee test = new Employee("Yuta002", "Test", "Update", new Date(), new Date(1997 - 1900, 12 - 1, 11), 3400.0f);
		
		String id = "Yuta003";
		String testId = "Yuta002";
		String deleteId = "Yuta004";
		String existId = "Yuta315";
		int input = 0;
		
		while((input < 1) || (input > 6)) {
			System.out.println("Choose option");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Find Employee by ID");
			System.out.println("4. Delete by EmployeeID");
			System.out.println("5. Delete All Employee Data");
			System.out.println("6. Find Employee is exist or not");
			System.out.print("Enter the number: ");
			input = scanner.nextInt();
		}
		
		if(input == 1)
		{
//			Add Employee
			String result = employeeService.addEmployee(employee);
			Optional<List<Employee>> optional = employeeService.getEmployees();
			
			if("Success".equals(result))
			{
				System.out.println("Record added successfully");
			}
			else
				System.out.println("There is Problem exist");
			
			if(optional.isPresent()) {
				optional.get().forEach(System.out::println);
			}
			
		}
		else if(input == 2)
		{
//			Update process
			String result2 = employeeService.updateEmployee(testId, test);
			
			if("Success".equals(result2))
			{
				System.out.println("Record update successfully");
			}
			else
				System.out.println("There is Problem exist in update process");
		}
		else if(input == 3)
		{
			Optional <Employee> optional2 = employeeService.getEmployeeById(id);

			if(optional2.isPresent()) {
				Employee employee2 = (Employee) optional2.get();
				System.out.println("\nFROM HERE THERE IS GET EMPLOYEE BY ID");
				System.out.println(employee2);
			}
		}
		else if(input == 4)
		{
//			Delete by id
			String result3 = employeeService.deleteEmployeeById(deleteId);	
			
			if("Success".equals(result3))
			{
				System.out.println("Delete '" + deleteId +  "' data is successfully");
			}
			else
				System.out.println("There is Problem exist in delete process");
		}
		else if(input == 5)
		{
//			Delete all data
			System.out.println("DELETE ALL DATA");
			employeeService.deleteAllEmployees();
			System.out.println("DONE");
		}
		else if(input == 6)
		{
//			is EmployeeExist
			boolean result4 = employeeService.isEmployeeExists(existId);
			if(result4 == true)
			{
				System.out.println("Employee '" + existId + "' is exist");
			}
			else
				System.out.println("Employee '" + existId + "' is not exist");
		}
	}

}
