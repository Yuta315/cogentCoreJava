package com.cogent.emsmongodb.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")

public class DBConfig {
//	DB related
	
	@Autowired
	
	Environment environment; // getInstance() // object ?
//	it should be created by the spring
//	do we need to inform the spring about the already created object?
//	boss we need the environment object ===
//	do we need already created object from the spring?
//	inject the already created object
//	Difference Injection.
	
	
	
//	data source ===>1
//	singleton object
	
	@Bean // used to get  /  hold singleton object
//	@Scope("prototype")
	
//	method level annotation
//	if you don't want to provide any bean name then provide the expected bean name as a method name
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(environment.getProperty("db.url"));
		basicDataSource.setUsername(environment.getProperty("db.userName"));
		basicDataSource.setPassword(environment.getProperty("db.password"));
		basicDataSource.setDriverClassName(environment.getProperty("db.className"));
		
		return basicDataSource;
	}
	
}
