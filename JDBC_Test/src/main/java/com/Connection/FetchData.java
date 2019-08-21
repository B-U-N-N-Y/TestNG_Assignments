package com.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

	PreparedStatement pst;
	ResultSet rs = null;

	public Object fetch() throws SQLException  {
		Object string = null;
		try {
			Connection con = new LoadDriver().lodingDriver();
			pst = con.prepareStatement("SELECT* FROM employee_tb1 where EmpId=5");
			rs = pst.executeQuery();
			while (rs.next())
			string=rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
						+ " " + rs.getFloat(5);
	
		} catch (SQLException e) {

		}
		return string;
	}
}
