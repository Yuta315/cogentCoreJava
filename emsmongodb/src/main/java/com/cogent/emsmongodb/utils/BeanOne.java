package com.cogent.emsmongodb.utils;

public class BeanOne {

	BeanTwo beanTwo;
	
//	@Autowired
	
	 public BeanOne(BeanTwo beanTwo) {
		
		this.beanTwo = beanTwo;
	    System.out.println("BeanOne Initialized");
	   }

	public void doSomthing() {
		beanTwo.doSomthing();
		System.out.println("Inside doSomthing() method of BeanOne");
	   
	}
}
