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
import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.utils.DBUtils;
@Repository
//@Component
public class CartRepositoryImpl implements CartRepository {
	
//	private static CartRepository cartRepository;
//	private Cart carts[] = new Cart[10];

	@Autowired
	DBUtils dbUtils;
/*	
	DBUtils dbUtils = DBUtils.getInstance();
	
	private CartRepositoryImpl() {
		
	}

	public static CartRepository getInstance()
	{		
		if(cartRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CartRepositoryImpl.class) {
				if(cartRepository == null) {
					cartRepository = new CartRepositoryImpl();
					return cartRepository;
				}
			}
		}
		return cartRepository;
		
	}
*/	
//	private Set<Cart> carts = new HashSet<>;
	
	static int counter = 0;

	
	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
//		if(counter >= carts.length)
//		{	
//			return "array is full";
//		}
//		
//		carts[counter++] = cart;
//		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into cart (cartId, userId, invId, productId, productQty, totalPrice) values(?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, cart.getCartId());
			preparedStatement.setString(2, cart.getUserId());
			preparedStatement.setString(3, cart.getInvId());
			preparedStatement.setString(4, cart.getProductId());
			preparedStatement.setLong(5, cart.getProductQty());
			preparedStatement.setDouble(6, cart.getTotalPrice());
			
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

	public String deleteCartById(String id) throws IdNotFoundException
	{
//		1. that id exists or not.
//		Cart cart = this.getCartById(id);
//
//		if(cart != null)
//		{
////			record found
////			we need to set null
//			int index = this.getIndex(cart);
//			
//			if(index != -1)
//			{
////				record found
//				carts[index] = null;
//				return "Success";
//				
////				we need to set null;
//			}
//		}
//		else
//		{
////			return "not found";
//			throw new IdNotFoundException("ID not found");
//		}
////		2. id exists then set null to location?
////		if return not found
//		
////		return "not found";
//		throw new IdNotFoundException("ID not found");
		
		
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from cart WHERE cartId=?";
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
	public void deleteAllCarts() {
		// TODO Auto-generated method stub
//		return carts = null;
		Connection connection = dbUtils.getConnection();
		
		String deleteAllCartsStatement = "DELETE FROM cart";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllCartsStatement);
			
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
	
	public Optional<Cart> getCartById(String id) throws IdNotFoundException
	{
//		for(Cart cart : carts)
//		{
//			if(cart != null && id.equals(cart.getCartId()))
//			{
//				return cart;
//			}
//		}
//
//		throw new IdNotFoundException("ID not found");
////		return null;
		
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from cart Where cartId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Cart cart = new Cart();
				
				cart.setCartId(resultSet.getString("cartId"));
			
				return Optional.ofNullable(cart);				
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

	public Optional<List<Cart>> getCarts()
	{
		Connection connection = dbUtils.getConnection();
		ArrayList<Cart> arrayList = new ArrayList<>();
		
		String query = "select * from cart";
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
				
				
				Cart cart = new Cart();
				
				cart.setCartId(resultSet.getString("cartId"));
				cart.setUserId(resultSet.getString("userId"));
				cart.setInvId(resultSet.getString("invId"));
				cart.setProductId(resultSet.getString("productId"));
				cart.setProductQty(resultSet.getInt("productQty"));
				cart.setTotalPrice(resultSet.getDouble("totalPrice"));
				
				arrayList.add(cart);
			}
			
//			if(arrayList.isEmpty())
//			{
//				return Optional.empty();
//			}
//			else
//				return Optional.of(arrayList);

			return Optional.ofNullable(arrayList);
			
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
	public String updateCart(String id, Cart Cart) throws IdNotFoundException {
		// TODO Auto-generated method stub
		
//		this.getCartById(id);
//	
//		
//		int index = this.getIndex(cart);
//		carts[index] = cart;
//		
//		return "Success";
//		
////		return null;
		
		Connection connection = dbUtils.getConnection();
		
		String updateStatement = "update cart set cartId=?, userId=?, invId=?, productId=?, productQty=?, totalPrice=?  where cartId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, Cart.getCartId());
			preparedStatement.setString(2, Cart.getUserId());
			preparedStatement.setString(3, Cart.getInvId());
			preparedStatement.setString(4, Cart.getProductId());
			preparedStatement.setLong(5, Cart.getProductQty());
			preparedStatement.setDouble(6, Cart.getTotalPrice());
			
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
	public boolean isCartExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}