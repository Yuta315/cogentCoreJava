package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Orders;
import com.cogent.ecommerce.model.User;

public class UserRepositoryImpl implements UserRepository {

private User user[] = new User[10];
	
	private static UserRepository userRepository;
	
	private UserRepositoryImpl() {
		
	}

	public static UserRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(userRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (InventoryRepositoryImpl.class) {
				if(userRepository == null) {
					userRepository = new UserRepositoryImpl();
					return userRepository;
				}
			}
		}
		return userRepository;
		
	}
	
	
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
