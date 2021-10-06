package com.cogent.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor

public class Role {
	
	private String roleId;
	private String roleName;

	public Role()
	{
		this.roleId = "";	
	}

}
