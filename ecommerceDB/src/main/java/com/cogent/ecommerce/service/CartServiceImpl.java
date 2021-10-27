package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.repository.CartRepository;

//@Component
@Service

public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository cartRepository;
/*	
	private static CartService cartService;
	
	private CartRepository cartRepository = CartRepositoryImpl.getInstance();
//	are we consuming the repo?
	
//	loose coupling : 
	

	private CartServiceImpl()
	{
		
	}
	public static CartService getInstance()
	{
//		if(cartService == null) {
//			
////			synchronized (cartRepositoryALImpl.class) {
			synchronized (CartServiceImpl.class) {
				if(cartService == null) {
					cartService = new CartServiceImpl();
					return cartService;
				}
			}
		return cartService;
		
//		if(cartService == null) {
//			cartService = new CartServiceImpl();
//			return cartService;
//		}
//		return cartService;
		
	}
	
*/
	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.addCart(cart);
	}

	@Override
	public String deleteCartById(String id) throws IdNotFoundException{
		// TODO Auto-generated method stub
		return cartRepository.deleteCartById(id);
	}

	@Override
	public void deleteAllCarts(){
		// TODO Auto-generated method stub
		cartRepository.deleteAllCarts();
	}

	@Override
	public Optional<Cart> getCartById(String id) throws IdNotFoundException{
		// TODO Auto-generated method stub
		return cartRepository.getCartById(id);
	}

	@Override
	public Optional<List<Cart>> getCarts() {
		// TODO Auto-generated method stub
		return cartRepository.getCarts();
	}

	@Override
	public String updateCart(String id, Cart Cart) throws IdNotFoundException{
		// TODO Auto-generated method stub
		return cartRepository.updateCart(id, Cart);
	}
	@Override
	public boolean isCartExists(String cartId) {
		// TODO Auto-generated method stub
		return cartRepository.isCartExists(cartId);
	}

}
