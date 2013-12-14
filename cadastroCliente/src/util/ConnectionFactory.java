package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection con;
	
	public static Connection getConnection(){
	
		try {
			con = DriverManager.getConnection("jdbc:postgres://192.168.0.108","postgres","123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
