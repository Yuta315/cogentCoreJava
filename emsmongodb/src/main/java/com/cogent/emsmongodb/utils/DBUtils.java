package com.cogent.emsmongodb.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // singleton object
@Lazy(value = true)
public class DBUtils {
	
	@Autowired // DI
	DataSource dataSource;
	
//	private DBUtils() {
	public DBUtils() {
		
	}
	
//	private static DBUtils dbUtils;
//	public static DBUtils getInstance() {
//		
//		if(dbUtils == null) {
//			dbUtils = new DBUtils();
//			return dbUtils;
//		}
//		
//		return dbUtils;
//		
//	}
	
/*	
	public static void main(String[] args) {
		
		DBUtils dbUtils = getInstance();
		
		Properties properties = dbUtils.readProperties();
		
		System.out.println(properties);
		
//		dbutils singleton object
//		can u call readProperties method
//		can u print properties object
		
		Connection connection = dbUtils.getConnection();
		
		System.out.println(connection != null);
	}
	
	
	public Properties readProperties() {
		
		Properties properties = new Properties();

//		FileInputStream fileInputStream = new FileInputStream();
		InputStream inputStream = getClass().getClassLoader().getSystemResourceAsStream("application.properties");
		
		try {
			properties.load(inputStream);
			return properties;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
*/	
	
//	singleton pattern.
	public Connection getConnection() {
		
//		Properties properties = this.readProperties();
		Connection connection = null;
		
		try {
//			Class.forName(properties.getProperty("db.className"));
//			connection = DriverManager.getConnection(properties.getProperty("db.url"),
//					properties.getProperty("db.userName"), properties.getProperty("db.password"));
			connection = dataSource.getConnection();
			return connection;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		return connection;
		return null;
	}
	
	public void closeConnection(Connection connection) {
		
		try {
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
