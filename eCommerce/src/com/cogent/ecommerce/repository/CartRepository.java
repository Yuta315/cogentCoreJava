package com.cogent.ecommerce.repository;

import java.util.*;

public interface CartRepository {
	public String addCart(CartRepository Cart);
	public String deleteCartById(String id);
	public void deleteAllCarts();
	public CartRepository getCartById(String id);
	public List<CartRepository> getCarts();
	public String updateCart(String id, CartRepository Cart);
	public boolean isCartExists(String id);
}


