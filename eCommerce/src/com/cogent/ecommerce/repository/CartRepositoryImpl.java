package com.cogent.ecommerce.repository;

import java.io.IOException;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Cart;


public class CartRepositoryImpl implements CartRepository {
	
	private Cart carts[] = new Cart[10];
	
	private static CartRepository cartRepository;
	
	private CartRepositoryImpl() {
		
	}

	public static CartRepository getInstance()
	{
		if(cartRepository == null)
		{
			cartRepository = new CartRepositoryImpl();
			return cartRepository;
		}
		return cartRepository;
	}
	
	static int counter = 0;

	
	@Override
	public String addCart(CartRepository Cart) {
		// TODO Auto-generated method stub
		if(counter >= carts.length)
		{	
			return "array is full";
		}
		
		carts[counter++] = cart;
		return "Success";
		
//		return null;
	}

	public String deleteCartById(String id) throws IdNotFoundException, IOException
	{
//		1. that id exists or not.
		Cart cart = this.getCartById(id);

		if(cart != null)
		{
//			record found
//			we need to set null
			int index = this.getIndex(cart);
			
			if(index != -1)
			{
//				record found
				carts[index] = null;
				return "Success";
				
//				we need to set null;
			}
		}
		else
		{
//			return "not found";
			throw new IdNotFoundException("ID not found");
		}
//		2. id exists then set null to location?
//		if return not found
		
//		return "not found";
		throw new IdNotFoundException("ID not found");
		
	}

	@Override
	public void deleteAllCarts() {
		// TODO Auto-generated method stub
		return carts = null;
		
	}
	
	public Cart getCartById(String id) throws IdNotFoundException, IOException
	{
		for(Cart cart : carts)
		{
			if(cart != null && id.equals(cart.getCartId()))
			{
				return cart;
			}
		}

		throw new IdNotFoundException("ID not found");
//		return null;
		
	}

	public Cart[] getCarts()
	{
		return carts;
	}
	

	@Override
	public String updateCart(String id, Cart Cart) throws IdNotFoundException, IOException  {
		// TODO Auto-generated method stub
		
		this.getCartById(id);
	
		
		int index = this.getIndex(cart);
		carts[index] = cart;
		
		return "Success";
		
//		return null;
	}

	
	
	@Override
	public boolean isCartExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}