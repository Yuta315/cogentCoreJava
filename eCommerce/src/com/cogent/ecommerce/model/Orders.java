package com.cogent.ecommerce.model;

public class Orders {
	
	private String orderId;
	private String userId;
	private String invId;
	private String productId;
	private String productQty;
	private String totalPrice;
	private String grandTotalPrice;
	
	public Orders()
	{
		this.orderId = "";
	}

	public Orders(String orderId, String userId, String invId, String productId, String productQty, String totalPrice, String grandTotalPrice) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.invId = invId;
		this.productId = productId;
		this.productQty = productQty;
		this.totalPrice = totalPrice;
		this.grandTotalPrice = grandTotalPrice;
	}
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
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
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getGrandTotalPrice() {
		return grandTotalPrice;
	}
	public void setGrandTotalPrice(String grandTotalPrice) {
		this.grandTotalPrice = grandTotalPrice;
	}
	
}
	

