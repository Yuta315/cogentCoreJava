package com.cogent.productmanagement.service;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
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
	public String updateProduct(String productId, Product product) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(productId, product);
//		return null;
	}

	@Override
	public Product getProductById(String id) {
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
	public String deleteProductById(String id) {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(id);
//		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		
	}
	

}

