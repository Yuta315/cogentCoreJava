package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Cart;

public interface CartService {
	public String addCart(Cart cart);
	public String deleteCartById(String cartId) throws IdNotFoundException;
	public void deleteAllCarts();
	public Optional<Cart> getCartById(String cartId) throws IdNotFoundException;
	public Optional<List<Cart>> getCarts();
	public String updateCart(String cartId, Cart cart) throws IdNotFoundException;
	public boolean isCartExists(String cartId) throws IdNotFoundException;
}


