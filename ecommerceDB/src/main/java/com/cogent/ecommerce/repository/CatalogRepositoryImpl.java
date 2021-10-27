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
import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommerce.utils.DBUtils;

@Repository
//@Component

public class CatalogRepositoryImpl implements CatalogRepository {
	
//	private Catalog catalogs[] = new Catalog[10];
	@Autowired
	DBUtils dbUtils;

/*	
	private static CatalogRepository catalogRepository;
	DBUtils dbUtils = DBUtils.getInstance();
	
	private CatalogRepositoryImpl() {
		
	}

	public static CatalogRepository getInstance()
	{
//		if(CatalogRepository == null)
//		{
//			CatalogRepository = new CatalogRepositoryImpl();
//			return CatalogRepository;
//		}
//		return CatalogRepository;
		
		if(catalogRepository == null) {
			
//			synchronized (CatalogRepositoryALImpl.class) {
			synchronized (CatalogRepositoryImpl.class) {
				if(catalogRepository == null) {
					catalogRepository = new CatalogRepositoryImpl();
					return catalogRepository;
				}
			}
		}
		return catalogRepository;
		
	}
*/
	
	static int counter = 0;

	@Override
	public String addCatalog(Catalog Catalog) {
		// TODO Auto-generated method stub
//		if(counter >= catalogs.length)
//		{	
//			return "array is full";
//		}
//		
//		catalogs[counter++] = Catalog;
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into catalog (productId, productName, catId, productDescription, productImage) values(?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);

			preparedStatement.setString(1, Catalog.getProductId());
			preparedStatement.setString(2, Catalog.getProductName());
			preparedStatement.setString(3, Catalog.getCatId());
			preparedStatement.setString(4, Catalog.getProductDescription());
			preparedStatement.setString(5, Catalog.getProductImage());

			
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
	public String deleteCatalogById(String id) {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from catalog WHERE productId=?";
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
	public void deleteAllCatalogs() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllCatalogsStatement = "DELETE FROM catalog";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllCatalogsStatement);
			
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
	public Optional<Catalog> getCatalogById(String id)  throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from catalog Where productId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Catalog catalog = new Catalog();
				
				catalog.setProductId(resultSet.getString("productId"));
			
				return Optional.ofNullable(catalog);				
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
	public Optional<List<Catalog>> getCatalogs() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		ArrayList<Catalog> arrayList = new ArrayList<>();
		
		String query = "select * from catalog";
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
				
				
				Catalog catalog = new Catalog();
				
				catalog.setProductId(resultSet.getString("productId"));
				catalog.setProductName(resultSet.getString("productName"));
				catalog.setCatId(resultSet.getString("catId"));
				catalog.setProductDescription(resultSet.getString("productDescription"));
				catalog.setProductImage(resultSet.getString("productImage"));
				
				arrayList.add(catalog);
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
	public String updateCatalog(String id, Catalog Catalog) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
//		String updateStatement = "insert into catalog (productId, productName, catId, productDescription, productImage) values(?,?,?,?,?,?)";
		String updateStatement = "update catalog set productId=?, productName=?, catId=?, productDescription=?, productImage=? where productId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, Catalog.getProductId());
			preparedStatement.setString(2, Catalog.getProductName());
			preparedStatement.setString(3, Catalog.getCatId());
			preparedStatement.setString(4, Catalog.getProductDescription());
			preparedStatement.setString(5, Catalog.getProductImage());
			
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
	public boolean isCatalogExists(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
