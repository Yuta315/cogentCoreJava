package com.cogent.emsmongodb.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.emsmongodb.dto.Employee;
import com.cogent.emsmongodb.utils.DBUtils;
//@Component
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

//	can u implement singleton DP.
	
//	DBUtils dbUtils = DBUtils.getInstance();
	
	@Autowired
	DBUtils dbUtils;

/*	
	private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository == null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	private EmployeeRepositoryImpl() {
		
	}
*/	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into employee (empId, empFirstName, empLastName, doj, dob, salary) values(?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(insertStatement);
			
//			preparedStatement = connection.prepareStatement(updateStatement);
//			preparedStatement = connection.prepareStatement(deleteStatement);
						
			
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setDate(4, new Date(employee.getDoj().getTime()));
//			can u provide the values accordingly
//			preparedStatement.setDate(2, employee.getDob());
//			preparedStatement.setDate(2, new Date(LocalDate.parse(insertStatement));
			preparedStatement.setDate(5, new Date(employee.getDob().getTime()));
			preparedStatement.setFloat(6, employee.getEmpSalary());
			
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
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteStatement = "delete from employee WHERE empID=?";
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
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		
		String deleteAllEmployeesStatement = "DELETE FROM employee";
		
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(deleteAllEmployeesStatement);
			
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
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
//		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from employee Where empId =?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {		
				Employee employee = new Employee();
				
				employee.setEmpId(resultSet.getString("empId"));
			
				return Optional.ofNullable(employee);				
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
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from employee";
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
				
				
				Employee employee = new Employee();
				
				employee.setEmpId(resultSet.getString("empId"));
				employee.setEmpFirstName(resultSet.getString("empFirstName"));
				employee.setEmpFirstName(resultSet.getString("empLastName"));
//				employee.setEmpSalary(resultSet.getFloat("empSalary"));
				employee.setEmpSalary(resultSet.getFloat("salary"));
				employee.setDob(resultSet.getDate("dob"));
				employee.setDoj(resultSet.getDate("doj"));
				
				arrayList.add(employee);
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
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
		
		String updateStatement = "update employee set empId=?, empFirstName=?, empLastName=?, doj=?, dob=?, salary=?  where empId=?";
//		update employee set empId = "Yuta002", empFirstName = "Yuta", empLastName = "Mogi", doj = CURDATE(), dob = CURDATE(), 
//				salary = 1100.0 WHERE empId = "Yuta002";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(updateStatement);
			
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setDate(4, new Date(employee.getDoj().getTime()));
			preparedStatement.setDate(5, new Date(employee.getDob().getTime()));
			preparedStatement.setFloat(6, employee.getEmpSalary());
			preparedStatement.setString(7, id);
			
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
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		
		Connection connection = dbUtils.getConnection();
		
		String isEmployeeExistsStatement = "SELECT (empId =?) from employee";
//		SELECT (empId = "Yuta315") from employee;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(isEmployeeExistsStatement);
			
			preparedStatement.setString(1, id);
			
			boolean resultSet = preparedStatement.execute();
			
//			if(resultSet == true)
//			{
//				return true;
//			}
//			else
//				return false;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
		
		return false;
	}

}
