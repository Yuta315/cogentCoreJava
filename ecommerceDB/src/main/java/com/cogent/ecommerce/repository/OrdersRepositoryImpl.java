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
import com.cogent.ecommerce.model.Orders;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class OrdersRepositoryImpl implements OrdersRepository {
	
//private Orders orders[] = new Orders[10];
	@Autowired
	DBUtils dbUtils;
	
/*
	private static OrdersRepository ordersRepository;
	
	DBUtils dbUtils = DBUtils.getInstance();
	
	private OrdersRepositoryImpl() {
		
	}

	public static OrdersRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(ordersRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (InventoryRepositoryImpl.class) {
				if(ordersRepository == null) {
					ordersRepository = new OrdersRepositoryImpl();
					return ordersRepository;
				}
			}
		}
		return ordersRepository;
		
	}
*/
	
	static int counter = 0;

	@Override
	public String addOrders(Orders Orders) {
		// TODO Auto-generated method stub
//		if(counter >= orders.length)
//		{	
//			return "array is full";
//		}
//		
//		orders[counter++] = Orders;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into orders (orderId, userId, invId, productId, productQty, totalPrice, grandTotalPrice) values(?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, Orders.getOrderId());
			preparedStatement.setString(2, Orders.getUserId());
			preparedStatement.setString(3, Orders.getInvId());
			preparedStatement.setString(4, Orders.getProductId());
			preparedStatement.setLong(5, Orders.getProductQty());
			preparedStatement.setDouble(6, Orders.getTotalPrice());
			preparedStatement.setDouble(7, Orders.getGrandTotalPrice());
			
			
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
	public String deleteOrdersById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from orders WHERE orderId=?";
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
	public void deleteAllOrderss() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllOrdersStatement = "DELETE FROM orders";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllOrdersStatement);
			
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
	public Optional<Orders> getOrdersById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from orders Where orderId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Orders orders = new Orders();
				
				orders.setOrderId(resultSet.getString("orderId"));
			
				return Optional.ofNullable(orders);				
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
	public Optional<List<Orders>> getOrders() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<Orders> arrayList = new ArrayList<>();
		
		String query = "select * from orders";
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
				
				
				Orders orders = new Orders();
				
				orders.setOrderId(resultSet.getString("orderId"));
				orders.setUserId(resultSet.getString("userId"));
				orders.setInvId(resultSet.getString("invId"));
				orders.setProductId(resultSet.getString("productId"));
				orders.setProductQty(resultSet.getLong("productQty"));
				orders.setTotalPrice(resultSet.getDouble("totalPrice"));
				orders.setGrandTotalPrice(resultSet.getDouble("gradnTotalPrice"));
				
				
				arrayList.add(orders);
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
	public String updateOrders(String id, Orders Orders) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into orders (orderId, userId, invId, productId, productQty, totalPrice, grandTotalPrice) values(?,?,?,?,?,?,?)";
		String updateStatement = "update orders set orderId=?, userId=?, invId=?, productId=?, productQty=?, totalPrice=?, grandTotalPrice where orderId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, Orders.getOrderId());
			preparedStatement.setString(2, Orders.getUserId());
			preparedStatement.setString(3, Orders.getInvId());
			preparedStatement.setString(4, Orders.getProductId());
			preparedStatement.setLong(5, Orders.getProductQty());
			preparedStatement.setDouble(6, Orders.getTotalPrice());
			preparedStatement.setDouble(7, Orders.getGrandTotalPrice());
			
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
	public boolean isOrdersExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
