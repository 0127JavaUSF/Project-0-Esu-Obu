package zero.project.util.ESUBankApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	public static Connection geCOnnection() {
		
		String url = System.getenv("JDBC_url");
		String userName = System.getenv("JDBC_ROLE");
		String password = System.getenv("JDBC_PASSWORD");
		try {
				return DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
		
	}	
	
}
