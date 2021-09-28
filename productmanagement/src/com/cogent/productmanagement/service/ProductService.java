package com.cogent.productmanagement.service;
import com.cogent.productmanagement.exception.InvalidProductId;
import com.cogent.productmanagement.model.Product;
import java.io.*;

public interface ProductService {

	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws InvalidProductId, IOException;
	public Product getProductById(String id) throws InvalidProductId, IOException;
	public Product[] getProduct();
	public String deleteProductById(String id) throws InvalidProductId, IOException;
	public void deleteAllProducts();
}
