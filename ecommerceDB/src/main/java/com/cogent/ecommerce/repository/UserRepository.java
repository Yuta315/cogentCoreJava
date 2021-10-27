package com.cogent.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.User;


public interface UserRepository {

	public String addUser(User user);
	public String deleteUserById(String id) throws IdNotFoundException;
	public void deleteAllUsers() throws IdNotFoundException;
	public Optional<User> getUserById(String id) throws IdNotFoundException;
	public Optional<List<User>>getUsers();
	public String updateUser(String id, User user) throws IdNotFoundException;
	public boolean isUserExists(String id) throws IdNotFoundException;
	
}
