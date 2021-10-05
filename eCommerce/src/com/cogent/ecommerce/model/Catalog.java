package com.cogent.ecommerce.model;

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
	
	public Catalog(String productId, String productName, String catId, String productDescription, String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.catId = catId;
		this.productDescription = productDescription;
		this.productImage = productImage;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	

}
