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
import com.cogent.ecommerce.model.Category;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class CategoryRepositoryImpl implements CategoryRepository {
	
//private Category categorys[] = new Category[10];
	
	@Autowired
	DBUtils dbUtils;
/*
	private static CategoryRepository categoryRepository;
	

	DBUtils dbUtils = DBUtils.getInstance();
	
	
	private CategoryRepositoryImpl() {
		
	}

	public static CategoryRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(categoryRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CategoryRepositoryImpl.class) {
				if(categoryRepository == null) {
					categoryRepository = new CategoryRepositoryImpl();
					return categoryRepository;
				}
			}
		}
		return categoryRepository;
		
	}
*/
	
	static int counter = 0;

	@Override
	public String addCategory(Category Category) {
		// TODO Auto-generated method stub
//		if(counter >= categorys.length)
//		{	
//			return "array is full";
//		}
//		
//		categorys[counter++] = Category;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into catagory (catId, catName) values(?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, Category.getCatId());
			preparedStatement.setString(2, Category.getCatName());

			
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
	public String deleteCategoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from category WHERE catId=?";
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
	public void deleteAllCategorys() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllCategorysStatement = "DELETE FROM category";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllCategorysStatement);
			
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
	public Optional<Category> getCategoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from category Where catId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Category category = new Category();
				
				category.setCatId(resultSet.getString("catId"));
			
				return Optional.ofNullable(category);				
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
	public Optional<List<Category>> getCategorys() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<Category> arrayList = new ArrayList<>();
		
		String query = "select * from category";
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
				
				
				Category category = new Category();
				
				category.setCatId(resultSet.getString("productId"));
				category.setCatName(resultSet.getString("catName"));
				
				arrayList.add(category);
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
	public String updateCategory(String id, Category Category) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into category (catId, catName) values(?,?)";
		String updateStatement = "update category set catId=?, catName=? where catId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, Category.getCatId());
			preparedStatement.setString(2, Category.getCatName());
			
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
	public boolean isCategoryExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
