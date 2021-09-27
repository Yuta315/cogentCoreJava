package com.cogent.employeemanagementsystem.exception;

import lombok.ToString;

@ToString

public class IdNotFoundException extends RuntimeException {

	public IdNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		
		super(message);
	}
	
	
}

