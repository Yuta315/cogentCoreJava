package com.cogent.productmanagement.repository;
import java.io.IOException;

import com.cogent.productmanagement.exception.InvalidProductId;
import com.cogent.productmanagement.model.Product;

public interface ProductRepository {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws InvalidProductId, IOException;
	public Product getProductById(String id) throws InvalidProductId, IOException;
	public Product[] getProduct();
	public String deleteProductById(String id) throws InvalidProductId, IOException;
	public void deleteAllProducts() throws InvalidProductId, IOException;
}
