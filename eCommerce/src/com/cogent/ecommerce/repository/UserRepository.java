package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.User;


public interface UserRepository {

	public String addUser(User user);
	public String deleteUserById(String id) throws IdNotFoundException, IOException;
	public void deleteAllUsers() throws IdNotFoundException, IOException;
	public User getUserById(String id) throws IdNotFoundException, IOException;
	public List<User> getUsers();
	public String updateUser(String id, User user) throws IdNotFoundException, IOException;
	public boolean isUserExists(String id);
	
}
