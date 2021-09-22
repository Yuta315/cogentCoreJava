package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;

public class InheritanceDemo {

	public static final float PI = 3.14f;
//	static : only one copy
//	final : can't change the value.
	public final int a;
	
	public int b;
	public InheritanceDemo() {
		// TODO Auto-generated constructor stub
		this.a = 10;
	}
	
	
	public final static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int b = 100;
		System.out.println("Hello from Yuta" + b);
		
//		Employee manager = new Manager();
//		"Yut001", "Yuta", "Mogi", 1500.f, 123, "PA");
//		All functionalities from Employee + overridden methods.
		
//		Parent type : Child type
//		object's behavior completely depending on ref type.
		
//		System.out.println("emp id" + manager.getEmpSalary());
		
//		float salary = manager.calculateSalary();
		
//		System.out.println(salary);
//		System.out.println(manager.calculateSalary());

//		Manager manager2 = (Manager) manager;
		
//		System.out.println(manager2.getProjectAllow());
		
//		ProjectManager pm = new ProjectManagr();
//		E + M + PM
	
//		Manager pm = new ProjectManager();
//		E + M
		
//		Employee pm = new ProjectManager();
//		E

	}

}
