package zero.project.daos.ESUBankApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import zero.project.exceptions.ESUBankApp.ValidationException;
import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.ConnectionUtil;



public interface CustomerDao {	
	
//take the data from db and add to java variables----------------------------------------------
	static Customer extractUser(ResultSet result) throws SQLException {
		int custID = result.getInt("cust_id");
		String custName = result.getString("cust_name");
		String userName = result.getString("cust_username");
		String email = result.getString("email");
		String password = result.getString("cust_password");
		int accntNum = result.getInt("accnt_num");
		return new Customer(custID, custName, userName, password, email, accntNum );
	}
	//add a player into the db based on user input---------------------------------------------------------
	public static Customer createUser(Customer customer) {
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO customers (cust_id, cust_name, cust_username, email, cust_password, accnt_num) " +
					" VALUES (?, ?, ?) RETURNING *";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, customer.getCustId());
			statement.setString(2, Customer.getCustName());
			statement.setString(3, Customer.getUserName());
			statement.setString(4, customer.getEmail());
			statement.setString(5, Customer.getPassword());
			statement.setInt(6, customer.getAccntNum());
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				return extractUser(result);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}




}
