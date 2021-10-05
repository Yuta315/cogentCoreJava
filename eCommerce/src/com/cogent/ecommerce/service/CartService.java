package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Cart;

public interface CartService {
	public String addCart(Cart Cart);
	public String deleteCartById(String id);
	public void deleteAllCarts();
	public Cart getCartById(String id);
	public List<Cart> getCarts();
	public Cart[] getCartsByName(String name);
	public String updateCart(String id, Cart Cart);
}
