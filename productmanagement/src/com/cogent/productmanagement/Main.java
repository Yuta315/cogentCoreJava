package com.cogent.productmanagement;

import java.util.Date;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;
import com.cogent.productmanagement.exception.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService = ProductServiceImpl.getInstance();
		
//		ProductService product = new Product("KU100", "001", "Mogi", 123.0f);

//		Product product = new Product("001", "KU100", 100, 5, new Date(), new Date(), "Mic001");

		
//		String result = productService.addProduct(product);
		
//		System.out.println(result);
		
//		Product[] products = productService.getProduct();
	
		
//		for (Product product1 : products)
//		{
//			System.out.println(product1);
//		}
		

//		productService.deleteAllProducts();
		
//		product.setProductName("KU100");
		
//		try {
//			product.setProductName("");
//		} catch (InvalidProductName e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			product.setProductId(null);
//		} catch (InvalidProductId e) {
			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		try {
//			product.setProductPrice(-100);
//		} catch (InvalidProductPrice e) {
			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
//		productService.getProductById("KU100");
//		productService.updateProduct("KU100", product);
		Product product;
		String result = null;
		
		try {
			product = new Product("001", "KU100", 100, 5, new Date(), new Date(), "Mic001");
			productService.addProduct(product);
			System.out.println(product);
		} catch (InvalidProductId | InvalidProductName | InvalidProductPrice e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//			result = productService.addProduct(new Product("001", "KU100", 100, 5, new Date(), new Date(), "Mic001"));
//			result = productService.addProduct(product);

		
//		try {
//			result = productService.addProduct(new Product("001", "KU100", 100, 5, new Date(), new Date(), "Mic001"));
//			System.out.println(result);
//		} catch (InvalidProductId e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		if("Success".equals(result))
		{
			System.out.println("Product added successfully");
		}
	}

}
