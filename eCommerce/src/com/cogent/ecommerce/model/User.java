package com.cogent.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class User {

	
	private String userId;
	private String userName;
	private String password;
	private String emailId;
	private String roleId;
	
	public User()
	{
		this.userId = "";
	}
	

}
