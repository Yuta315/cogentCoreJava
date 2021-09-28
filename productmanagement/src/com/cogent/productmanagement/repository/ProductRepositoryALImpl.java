package com.cogent.productmanagement.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.productmanagement.exception.InvalidProductId;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.*;

public class ProductRepositoryALImpl implements ProductRepository {
	
	private ProductRepositoryALImpl()
	{
		
	}
	
private static ProductRepository productRepository;
	
	public static ProductRepository getInstance()
	{
		if(productRepository == null)
		{
			productRepository = new ProductRepositoryALImpl();
			return productRepository;
		}
		return productRepository;
	}
	
	private ArrayList<Product> products = new ArrayList<>();

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		
		boolean status = products.add(product);
		
		if(status)
		return "Sucess";
		else
			return "Fail";
			
//		return null;
//		return null;
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductId, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String id) throws InvalidProductId, IOException {
		// TODO Auto-generated method stub
		
		for (Product product : products) {
			if(id.equals(product.getProductId()))
				return product;;
		}
		
		return null;
	}

	@Override
	public Product[] getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductById(String id) throws InvalidProductId, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts() throws InvalidProductId, IOException {
		// TODO Auto-generated method stub

	}

}
