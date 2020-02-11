package zero.project.daos.ESUBankApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import zero.project.models.ESUBankApp.Account;
import zero.project.models.ESUBankApp.Customer;
import zero.project.util.ESUBankApp.ConnectionUtil;

public class AccountsDao {
	//This is my Data access object that is going to retrieve and manage my account data
	
	public static int routingNum;

	/*
	 * private String accntType; private int balance;
	 */
	private Account extractAccount(ResultSet result) throws SQLException {
		int accntNum = result.getInt("accnt_num");
		String accntType = result.getString("accnt_type");
		String accntHolder = result.getString("accnt_holder");
		int routingNum = result.getInt("routing_num");
		double balance = result.getByte("balance");
		return new Account(accntNum, accntType, accntHolder, routingNum, balance);

	}
	
	private Customer extractCustomers(ResultSet result) throws SQLException {
		int custId = result.getInt("cust_id");
		String custName = result.getString("cust_name");
		String userName = result.getString("cust_Username");
		String password = result.getString("cust_password");
		String email = result.getString("cust_email");
		int accntNum = result.getInt("accnt_num");
		return new Customer(custId, custName, userName, password, email, accntNum);
	}
	
	public Account getAccount(int accntNum) {
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "SELECT accnt_num, accnt_type, accnt_holder, routing_num, balance  FROM houses " +
					"WHERE accnt_num = ?";
			//Establishes connection to database
			PreparedStatement statement = connection.prepareStatement(sql);
			
			// Sets the PreparedStatement parameters
			statement.setInt(1, accntNum);
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				String accntType = result.getString("accnt_type");
				String accntHolder = result.getString("accnt_holder");
				int routingNum = result.getInt("routing_num");
				double balance = result.getInt("balance");
				return new Account(accntNum, accntType, accntHolder, routingNum, balance);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;		
	}

	public Account createAccount(Account account) {
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO accounts (accnt_type, accnt_holder, routing_num, balance) " +
					" VALUES (?, ?) RETURNING *";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, account.getAccntNum());
			statement.setString(2, account.getAccntType());
			statement.setString(3, account.getAccntHolder());
			statement.setInt(4, Account.getRoutingNum());
			statement.setDouble(5, Account.getBalance());
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				return extractAccount(result);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Customer> getCustomers(Account account) {
		List<Customer> customers = new ArrayList<>();
		try(Connection connection = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM customers WHERE accnt_num = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, account.getAccntNum());
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				customers.add(extractCustomers(result));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
}
