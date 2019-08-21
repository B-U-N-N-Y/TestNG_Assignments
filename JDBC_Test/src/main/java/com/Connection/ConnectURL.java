package com.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {

	public static void main(String[] args) throws SQLException {
		PreparedStatement pst;
		ResultSet rs = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			System.out.println("Driver loaded");
			String connectionUrl = "jdbc:sqlserver://ATMECSINLT-087\\SQLEXPRESS; database=Employee1; integratedSecurity=true;" ; 
			Connection con = DriverManager.getConnection(connectionUrl); 
			System.out.println("connection established");
			
			pst = con.prepareStatement("SELECT* FROM employee_tb1");
			rs = pst.executeQuery();

			// Iterate through the data in the result set and display it.

		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)
					+ " " + rs.getString(4) + " " + rs.getFloat(5));
		}

	}

}
