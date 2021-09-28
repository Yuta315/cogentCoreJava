package com.cogent.productmanagement.model;
import java.util.*;

import com.cogent.productmanagement.exception.InvalidProductId;
import com.cogent.productmanagement.exception.InvalidProductName;
import com.cogent.productmanagement.exception.InvalidProductPrice;

import lombok.*;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor

public final class Product {

	private String productId;
	private String productName;
	private float productPrice;
	private long qty;
	private Date createdDate;
	private Date expiryDate;
	private String batchNo;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) throws InvalidProductId{
		if(productId != null)
		this.productId = productId;
		else
			throw new InvalidProductId("Product Id is invalid.");
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) throws InvalidProductName{
		if(productName != null)
		this.productName = productName;
		else
			throw new InvalidProductName("Product Name is invalid.");
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) throws InvalidProductPrice{
		if(productPrice > 0)
		this.productPrice = productPrice;
		else
			throw new InvalidProductPrice("Product Price should be positive.");
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	
	
}

