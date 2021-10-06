package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.*;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Cart;


public interface CartRepository {
	public String addCart(CartRepository Cart);
	public String deleteCartById(String cartId) throws IdNotFoundException, IOException;
	public void deleteAllCarts() throws IdNotFoundException, IOException;
	public Cart getCartById(String cartId) throws IdNotFoundException, IOException;
	public List<CartRepository> getCarts();
	public String updateCart(String cartId, Cart Cart) throws IdNotFoundException, IOException;
	public boolean isCartExists(String cartId);
}


