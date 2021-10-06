package com.cogent.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class Orders {
	
	private String orderId;
	private String userId;
	private String invId;
	private String productId;
	private long productQty;
	private double totalPrice;
	private double grandTotalPrice;
	
	public Orders()
	{
		this.orderId = "";
	}
	
}
	

