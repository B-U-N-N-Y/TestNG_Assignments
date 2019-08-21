package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
	
	public Connection lodingDriver() throws SQLException {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			String connectionUrl = "jdbc:sqlserver://ATMECSINLT-087\\SQLEXPRESS; database=Employee1; integratedSecurity=true;" ; 
			Connection con = DriverManager.getConnection(connectionUrl); 
			return con;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
}
}
