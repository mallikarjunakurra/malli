package com.jdbc.Lab_Test_on_JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	public static Connection getConnection()
	{
		try
		{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Malli@123");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
