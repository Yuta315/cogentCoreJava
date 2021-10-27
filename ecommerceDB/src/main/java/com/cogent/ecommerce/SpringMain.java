package com.cogent.ecommerce;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cogent.ecommerce.config.Config;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
//		if u will not provide any name to the bean then by default it will take method name as a bean name
		
		
		System.out.println(dataSource.hashCode());
		System.out.println(dataSource.hashCode());
		DataSource dataSource2 = applicationContext.getBean("dataSource", DataSource.class);
		System.out.println(dataSource.equals(dataSource2));
		
	}

}
