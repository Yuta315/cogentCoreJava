package com.cogent.emsmongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cogent.emsmongodb.utils.BeanOne;
import com.cogent.emsmongodb.utils.BeanTwo;

@Configuration
@ComponentScan("com.cogent.emsmongodb") // @component, @service, @repository etc
// few annotations like @component is marked/ used in the base package com.cogent.emsmongodb
@Import(DBConfig.class)

public class Config {

//	application related
	@Autowired
	BeanTwo beanTwo;
	

//	@Bean("beanOne")
//	@Lazy(value = true) // it will load the bean / create the object lazily.
//	   Upper: if I comment out then out put will be BeanOne Ini & BeanTwo Ini, Hello, Inside do...
//	public BeanOne getBeanOne() {
//		return new BeanOne();
//	}
	
	
	@Bean("beanOne")
	public BeanOne getBeanOne() {
//		BeanTwo beanTwo = null;
//		return new BeanOne(null);
		return new BeanOne(beanTwo);
	}

	@Bean("beanTwo")
	public BeanTwo getBeanTwo() {
		return new BeanTwo();
	}
	
}
