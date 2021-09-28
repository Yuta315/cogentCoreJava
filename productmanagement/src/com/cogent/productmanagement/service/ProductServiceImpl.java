package com.cogent.productmanagement.service;
import com.cogent.productmanagement.exception.InvalidProductId;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryALImpl;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;
import java.io.*;

public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository = ProductRepositoryALImpl.getInstance();
	
	private static ProductService productService;
	
	private ProductServiceImpl()
	{
		
	}
	
	public static ProductService getInstance()
	{
		if(productService == null)
		{
			productService = new ProductServiceImpl();
			return productService;
		}
		return productService;
	}
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.addProduct(product);
//		return null;
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductId, IOException {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(productId, product);
//		return null;
	}

	@Override
	public Product getProductById(String id) throws InvalidProductId, IOException{
		// TODO Auto-generated method stub
		return productRepository.getProductById(id);
//		return null;
	}

	@Override
	public Product[] getProduct() {
		// TODO Auto-generated method stub
		return productRepository.getProduct();
//		return null;
	}

	@Override
	public String deleteProductById(String id) throws InvalidProductId, IOException {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(id);
//		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		
	}
	

}

