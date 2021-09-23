package com.cogent.productmanagement.repository;

import com.cogent.productmanagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository {
	
	private Product products[] = new Product[10];
	private static ProductRepository productRepository;

	static int counter = 0;
	
	private ProductRepositoryImpl()
	{
		
	}
	
	public static ProductRepository getInstance()
	{
		if(productRepository == null)
		{
			productRepository = new ProductRepositoryImpl();
			return productRepository;
		}
		return productRepository;
	}
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		if(counter >= products.length)
		{	
			return "Array is full";
		}
		
		products[counter++] = product;
		return "Success";
		
//		return null;
	}

	@Override
	public String updateProduct(String productId, Product product) {
		// TODO Auto-generated method stub
		this.getProductById(productId);

		int index = this.getIndex(product);
		products[index] = product;
		
		return "Success";
		
//		return null;
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		
		for(Product product : products)
		{
			if(product != null && id.equals(product.getProductId()))
			{
				return product;
			}
		}
		
		return null;
	}

	@Override
	public Product[] getProduct() {
		// TODO Auto-generated method stub
		return products;
//		return null;
	}

	@Override
	public String deleteProductById(String id) {
		// TODO Auto-generated method stub
//		1. that id exists or not.
		Product product = this.getProductById(id);

		if(product != null)
		{
//			record found
//			we need to set null
			int index = this.getIndex(product);
			
			if(index != -1)
			{
//				record found
				products[index] = null;
				return "Success";
				
//				we need to set null;
			}
		}
		else
		{
			return "not found";
		}
//		2. id exists then set null to location?
//		if return not found
		
		return "not found";	
		
//		return null;
	}

	private int getIndex(Product product) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < products.length; i++)
		{
			if(products[i].equals(product))
			{
				return i;
			}
		}
		return -1;
//		return 0;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub

		products = null;
	}

}
