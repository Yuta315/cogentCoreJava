package com.cogent.ecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.User;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class UserRepositoryImpl implements UserRepository {

//private User user[] = new User[10];
	@Autowired
	DBUtils dbUtils;

/*
	private static UserRepository userRepository;
	
	DBUtils dbUtils = DBUtils.getInstance();
	
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
*/	
	
	static int counter = 0;
	
	@Override
	public String addUser(User User) {
		// TODO Auto-generated method stub
//		if(counter >= user.length)
//		{	
//			return "array is full";
//		}
//		
//		user[counter++] = User;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into user (userId, userName, password, emailId, roleId) values(?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, User.getUserId());
			preparedStatement.setString(2, User.getUserName());
			preparedStatement.setString(3, User.getPassword());
			preparedStatement.setString(4, User.getEmailId());
			preparedStatement.setString(5, User.getRoleId());
			
			
			
			int res = preparedStatement.executeUpdate(); // no of rows affected by the statement will be returned
			
			if(res > 0)
			{
				return "Success";
			}
			else
			{
				return "Fail";
			}		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
		
//		return "Success";
		return null;
	}

	@Override
	public String deleteUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from user WHERE userId=?";
//		delete from employee WHERE empID = "Yuta001";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteStatement);
			
			preparedStatement.setString(1, id);
			
			int res = preparedStatement.executeUpdate(); // no of rows affected by the statement will be returned
			
			if(res > 0)
			{
				return "Success";
			}
			else
			{
				return "Fail";
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
		
		return null;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllUserStatement = "DELETE FROM user";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllUserStatement);
			
			int exe = preparedStatement.executeUpdate();
			
			if(exe > 0)
			{
				System.out.println("Success delete all data");
			}
			else
			{
				System.out.println("Delete is Failed");
			}	
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
	}

	@Override
	public Optional<User> getUserById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from user Where userId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				User user = new User();
				
				user.setRoleId(resultSet.getString("userId"));
			
				return Optional.ofNullable(user);				
			}						
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			dbUtils.closeConnection(connection);
		}
		
		return Optional.empty();
	}

	@Override
	public Optional<List<User>> getUsers() throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<User> arrayList = new ArrayList<>();
		
		String query = "select * from user";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
//				Employee info ===> string or numerical format or date etc.
//				Employee object
//				how many emp record
//				array or List
				
				
				User user = new User();
				
				user.setUserId(resultSet.getString("userId"));
				user.setUserName(resultSet.getString("userName"));				
				user.setPassword(resultSet.getString("password"));	
				user.setEmailId(resultSet.getString("emailId"));	
				user.setRoleId(resultSet.getString("roleId"));	
						
				arrayList.add(user);
			}
			
//			if(arrayList.isEmpty())
//			{
//				return Optional.empty();
//			}
//			else
//				return Optional.of(arrayList);

//			return Optional.ofNullable(arrayList);
			
//			return Optional.
//					empty : returning null
//					of : if u r confirm about the object (its not empty / not null)
//					ofNullable dicy
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			dbUtils.closeConnection(connection);
		}
		
		return Optional.empty();
	}

	@Override
	public String updateUser(String id, User user) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into user (userId, userName, password, emailId, roleId) values(?,?,?,?,?)";
		String updateStatement = "update user set userId=?, userName=?, password=?, emailId=?, roleId=? where userId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getEmailId());
			preparedStatement.setString(5, user.getRoleId());


			
			int res = preparedStatement.executeUpdate(); // no of rows affected by the statement will be returned
			
			if(res > 0)
			{
				return "Success";
			}
			else
			{
				return "Fail";
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
		
		return null;
	}

	@Override
	public boolean isUserExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
