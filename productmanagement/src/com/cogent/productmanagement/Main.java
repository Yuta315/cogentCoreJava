package com.cogent.productmanagement;

import java.util.*;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService = ProductServiceImpl.getInstance();
		
//		ProductService product = new Product("KU100", "001", "Mogi", 123.0f);

		Product product = new Product("001", "KU100", 100, 5, new Date(), new Date(), "Mic001");

		
		String result = productService.addProduct(product);
		
		System.out.println(result);
		
		Product[] products = productService.getProduct();
		
		
		
		for (Product product1 : products)
		{
			System.out.println(product1);
		}
		

		productService.deleteAllProducts();
		productService.getProductById("KU100");
		productService.updateProduct("KU100", product);
	}

}
