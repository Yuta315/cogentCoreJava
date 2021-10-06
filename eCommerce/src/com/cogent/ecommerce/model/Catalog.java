package com.cogent.ecommerce.model;

import lombok.*;
@Data
@AllArgsConstructor

public class Catalog {
	
	private String productId;
	private String productName;
	private String catId;
	private String productDescription;
	private String productImage;
	
	public Catalog()
	{
		this.productId = "";
	
	}

}
