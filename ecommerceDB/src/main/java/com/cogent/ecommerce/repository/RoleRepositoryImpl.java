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
import com.cogent.ecommerce.model.Role;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class RoleRepositoryImpl implements RoleRepository {

//private Role role[] = new Role[10];
	@Autowired
	DBUtils dbUtils;

/*
	private static RoleRepository roleRepository;
	
	DBUtils dbUtils = DBUtils.getInstance();
	
	private RoleRepositoryImpl() {
		
	}

	public static RoleRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(roleRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (RoleRepositoryImpl.class) {
				if(roleRepository == null) {
					roleRepository = new RoleRepositoryImpl();
					return roleRepository;
				}
			}
		}
		return roleRepository;
		
	}
*/	
	
	static int counter = 0;
	
	@Override
	public String addRole(Role Role) {
		// TODO Auto-generated method stub
//		if(counter >= role.length)
//		{	
//			return "array is full";
//		}
//		
//		role[counter++] = Role;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into role (roleId, roleName) values(?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, Role.getRoleId());
			preparedStatement.setString(2, Role.getRoleName());

			
			
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
	public String deleteRoleById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from role WHERE roleId=?";
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
	public void deleteAllRoles() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllRoleStatement = "DELETE FROM role";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllRoleStatement);
			
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
	public Optional<Role> getRoleById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from role Where roleId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Role role = new Role();
				
				role.setRoleId(resultSet.getString("roleId"));
			
				return Optional.ofNullable(role);				
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
	public Optional<List<Role>> getRoles() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<Role> arrayList = new ArrayList<>();
		
		String query = "select * from role";
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
				
				
				Role role = new Role();
				
				role.setRoleId(resultSet.getString("roleId"));
				role.setRoleName(resultSet.getString("roleName"));				
				
				arrayList.add(role);
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
	public String updateRole(String id, Role role) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into role (roleId, roleName) values(?,?)";
		String updateStatement = "update role set roleId=?, roleName=? where roleId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, role.getRoleId());
			preparedStatement.setString(2, role.getRoleName());

			
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
	public boolean isRoleExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
