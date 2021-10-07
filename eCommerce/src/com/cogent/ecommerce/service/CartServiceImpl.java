package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.repository.CartRepository;
import com.cogent.ecommerce.repository.CartRepositoryImpl;


public class CartServiceImpl implements CartService {
	
	CartRepository cartRepository = CartRepositoryImpl.getInstance();
//	are we consuming the repo?
	
//	loose coupling : 
	
	private static CartService cartService;
	private CartServiceImpl()
	{
		
	}
	public static CartService getInstance()
	{
		if(cartService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CartServiceImpl.class) {
				if(cartService == null) {
					cartService = new CartServiceImpl();
					return cartService;
				}
			}
		}
		return cartService;
	}
	

	@Override
	public String addCart(Cart Cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCartById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCarts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cart getCartById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart[] getCartsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCart(String id, Cart Cart) {
		// TODO Auto-generated method stub
		return null;
	}

}
