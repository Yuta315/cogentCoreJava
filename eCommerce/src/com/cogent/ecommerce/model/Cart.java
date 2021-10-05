package com.cogent.ecommerce.model;

public class Cart {
	
	private String cartId;
	private String userId;
	private String invId;
	private String productId;
	private String productQty;
	private String totalPrice;
	
	public Cart()
	{
		this.cartId = "";
	
		
	}
	
	public Cart(String cartId, String userId, String invId, String productId, String productQty, String totalPrice) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.invId = invId;
		this.productId = productId;
		this.productQty = productQty;
		this.totalPrice = totalPrice;;
	}
	
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
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
	


}
