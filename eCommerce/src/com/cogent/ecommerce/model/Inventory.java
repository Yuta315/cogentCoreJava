package com.cogent.ecommerce.model;

public class Inventory {
	
	private String invId;
	private String userId;
	private String productId;
	private String productQty;
	private String productPrice;
	
	public Inventory()
	{
		this.invId = "";
	
		
	}
	
	public Inventory(String invId, String userId, String productId, String productQty, String productPrice) {
		super();
		this.invId = invId;
		this.userId = userId;
		this.productId = productId;
		this.productQty = productQty;
		this.productPrice = productPrice;;
	}
	
	
	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId= userId;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductQty() {
		return productQty;
	}
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
}
