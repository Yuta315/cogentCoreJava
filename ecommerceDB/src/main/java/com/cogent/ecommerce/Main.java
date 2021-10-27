package com.cogent.ecommerce;
import java.util.Calendar;
import java.util.Scanner;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.service.CartService;
import com.cogent.ecommerce.service.CartServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CartService cartService = CartServiceImpl.getInstance();
		
		Scanner scanner = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1998);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DAY_OF_MONTH, 15);
//		Date dateRepresentation = cal.getTime();
//		Date test = new Date(cal.toString());
//		Date dobs = new Date(1998, 3, 15); // new Date(year - 1900, month - 1, day);
		
//		Employee employee = new Employee("Yuta001", "Yuta", "Mogi", new Date(), new Date(1998, 3, 15), 1500.0f);

		Cart cart = new Cart("Cart001", "Yuta001", "ABC001", "KU100", 10, 10000.0f);
	
	

	}

}
