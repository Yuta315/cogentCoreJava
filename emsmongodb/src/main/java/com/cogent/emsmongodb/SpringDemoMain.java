package com.cogent.emsmongodb;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cogent.emsmongodb.config.Config;
import com.cogent.emsmongodb.dto.Employee;
import com.cogent.emsmongodb.service.EmployeeService;
import com.cogent.emsmongodb.utils.BeanOne;
import com.cogent.emsmongodb.utils.BeanTwo;

public class SpringDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		to get that object
//		we have 2 ways (containers ===> where spring will manage the object life cycle)
//		bean factory
//		application context

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("Hello from application context");
//		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
//		if u will not provide any name to the bean then by default it will take method name as a bean name
		
		
//		System.out.println(dataSource.hashCode());
//		System.out.println(dataSource.hashCode());
//		DataSource dataSource2 = applicationContext.getBean("dataSource", DataSource.class);
//		System.out.println(dataSource.equals(dataSource2));
//		System.out.println(employeeService.hashCode());
//		System.out.println(employeeService);
		
		
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//		String result = employeeService.addEmployee(new Employee("Yuta001", "Yuta", "Mogi", new Date(), new Date(), 1500.0f));
//		System.out.println(result);
		
		
//		BeanTwo beanTwo = applicationContext.getBean(BeanTwo.class);
//		beanTwo.doSomthing();
		
		
		BeanOne beanOne = applicationContext.getBean(BeanOne.class);
		beanOne.doSomthing();
		
	}

}
