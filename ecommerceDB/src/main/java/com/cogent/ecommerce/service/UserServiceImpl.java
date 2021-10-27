package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.User;
import com.cogent.ecommerce.repository.UserRepository;

//@Component
@Service

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
/*	
	private static UserService userService;
	private UserRepository userRepository = UserRepositoryImpl.getInstance();
	
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
	
*/
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.addUser(user);
	}

	@Override
	public String deleteUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.deleteUserById(id);
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		userRepository.deleteAllUsers();
	}

	@Override
	public Optional<User> getUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.getUserById(id);
}

	@Override
	public Optional<List<User>> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.getUsers();
	}

	@Override
	public String updateUser(String id, User user) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.updateUser(id, user);
	}


	@Override
	public boolean isUserExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.isUserExists(id);
	}

}
