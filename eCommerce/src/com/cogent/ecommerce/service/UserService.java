package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.User;

public interface UserService {

	public String addUser(User user);
	public String deleteUserById(String id);
	public void deleteAllUsers();
	public User getUserById(String id);
	public List<User> getUsers();
	public User[] getUsersByName(String name);
	public String updateUser(String id, User user);
	
}
