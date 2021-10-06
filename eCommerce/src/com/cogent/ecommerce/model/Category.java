package com.cogent.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor


public class Category {
	
	private String catId;
	private String catName;
	
	public Category()
	{
		this.catId = "";

	}
	
}
