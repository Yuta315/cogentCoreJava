package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.User;


public interface UserRepository {

	public String addUser(User user);
	public String deleteUserById(String id);
	public void deleteAllUsers();
	public User getUserById(String id);
	public List<User> getUsers();
	public String updateUser(String id, User user);
	public boolean isUserExists(String id);
	
}
