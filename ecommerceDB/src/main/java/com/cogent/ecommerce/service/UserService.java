package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.User;

public interface UserService {

	public String addUser(User user);
	public String deleteUserById(String id) throws IdNotFoundException;
	public void deleteAllUsers();
	public Optional<User> getUserById(String id) throws IdNotFoundException;
	public Optional<List<User>>getUsers();
	public String updateUser(String id, User user) throws IdNotFoundException;
	public boolean isUserExists(String id) throws IdNotFoundException;
	
}
