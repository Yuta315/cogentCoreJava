package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.User;

public class UserServiceImpl implements UserService {
	
	private static UserService userService;
	private UserServiceImpl()
	{
		
	}
	public static UserService getInstance()
	{
		if(userService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (UserServiceImpl.class) {
				if(userService == null) {
					userService = new  UserServiceImpl();
					return userService;
				}
			}
		}
		return userService;
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
	public User[] getUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
