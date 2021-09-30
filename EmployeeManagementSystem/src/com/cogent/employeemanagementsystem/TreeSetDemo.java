package com.cogent.employeemanagementsystem;

import java.util.*;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;

public class TreeSetDemo {

	public static void main(String[] args)
	{
//		TreeSet<String> set = new TreeSet();
//		TreeSet<String> set2 = new TreeSet();
//		TreeSet<String> set3 = new TreeSet<String>();
		
//		set.add("Yuta");
//		set.add("Mogi");
//		set.add("Yuka");
//		set.add("Minase");
//		set.add("Test");
//		set.add("CS");
//		set.add("Japan");
//		set.add("USA");
//		set.add("Italy");
//		set.add("Apple");
//		set.add("Amazon");
//		set.add("Twitter");
		
//		System.out.println(set);
		
//		TreeSet <Employee> employees = new TreeSet<>();
		
		Comparator<Employee> comparator = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
		}; // anonymous class
		
		Comparator<Employee> comparator2 = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
		}; // anonymous class

		TreeSet <Employee> employees = new TreeSet<>(comparator);
		
		try {
			employees.add(new Employee("Yuta001", "Yuta", "Mogi", 315.00f));
//			employees.add(new Employee("Yuta003", "Yuta3", "Mogi", 315000.00f));
			employees.add(new Employee("Yuta003", "Yuta3", "Mogi", 315.00f));
//			employees.add(new Employee("Yuta015", "YutaSan", "Mogi", 31500.00f));
			employees.add(new Employee("Yuta015", "YutaSan", "Mogi", 315.00f));
//			employees.add(null);
//			System.out.println(employees);

//			employees.remove(new Employee("Yuta015", "YutaSan", "Mogi", 315.00f)); // this will delete only this part.
			
			System.out.println(employees);
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
		catch (ClassCastException e) {
			// TODO: handle exception
			
			System.out.println("Exception caught." + e);
		}
	}
}
