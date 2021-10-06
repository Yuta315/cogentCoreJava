package com.cogent.ecommerce.model;

import lombok.*;
@Data
@AllArgsConstructor

public class Cart {
	
	private String cartId;
	private String userId;
	private String invId;
	private String productId;
	private long productQty;
	private double totalPrice;
	
	public Cart()
	{
		this.cartId = "";
	
		
	}	

}
