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
import com.cogent.ecommerce.model.Inventory;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class InventoryRepositoryImpl implements InventoryRepository {
	
//private Inventory inventorys[] = new Inventory[10];
	@Autowired
	DBUtils dbUtils;
	
/*
	private static InventoryRepository inventoryRepository;
	
	DBUtils dbUtils = DBUtils.getInstance();
	
	private InventoryRepositoryImpl() {
		
	}

	public static InventoryRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(inventoryRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (InventoryRepositoryImpl.class) {
				if(inventoryRepository == null) {
					inventoryRepository = new InventoryRepositoryImpl();
					return inventoryRepository;
				}
			}
		}
		return inventoryRepository;
		
	}
*/	
	
	static int counter = 0;

	@Override
	public String addInventory(Inventory Inventory) {
		// TODO Auto-generated method stub
//		if(counter >= inventorys.length)
//		{	
//			return "array is full";
//		}
//		
//		inventorys[counter++] = Inventory;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into inventory (invId, userId, productId, productQty, productPrice) values(?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, Inventory.getInvId());
			preparedStatement.setString(2, Inventory.getUserId());
			preparedStatement.setString(3, Inventory.getProductId());
			preparedStatement.setLong(4, Inventory.getProductQty());
			preparedStatement.setDouble(5, Inventory.getProductPrice());
			
			
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
	public String deleteInventoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from inventory WHERE invId=?";
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
	public void deleteAllInventorys() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllInventorysStatement = "DELETE FROM inventory";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllInventorysStatement);
			
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
	public Optional<Inventory> getInventoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from inventory Where invId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Inventory inventory = new Inventory();
				
				inventory.setInvId(resultSet.getString("invId"));
			
				return Optional.ofNullable(inventory);				
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
	public Optional<List<Inventory>> getInventorys() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<Inventory> arrayList = new ArrayList<>();
		
		String query = "select * from inventory";
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
				
				
				Inventory inventory = new Inventory();
				
				inventory.setInvId(resultSet.getString("invId"));
				inventory.setUserId(resultSet.getString("userId"));
				inventory.setProductId(resultSet.getString("productId"));
				inventory.setProductQty(resultSet.getLong("productQty"));
				inventory.setProductPrice(resultSet.getDouble("productPrice"));
				
				
				arrayList.add(inventory);
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
	public String updateInventory(String id, Inventory Inventory) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into inventory (invId, userId, productId, productQty, productPrice) values(?,?,?,?,?,?)";
		String updateStatement = "update inventory set invId=?, userId=?, productId=?, productQty=?, productPrice=? where invId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, Inventory.getProductId());
			preparedStatement.setString(2, Inventory.getUserId());
			preparedStatement.setString(3, Inventory.getProductId());
			preparedStatement.setLong(4, Inventory.getProductQty());
			preparedStatement.setDouble(5, Inventory.getProductPrice());
			
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
	public boolean isInventoryExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
