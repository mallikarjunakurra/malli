package com.jdbc.Lab_Test_on_JDBC_Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.Lab_Test_on_JDBC_Connection.ConnectionProvider;
import com.jdbc.Lab_Test_on_JDBC_Dao.UsersDao;

public class UsersDaoimpl implements UsersDao{

	Connection con=ConnectionProvider.getConnection();
	
	//To Create User
	 public int insertUser(String uname, String password) throws SQLException
	 {
	    String query="insert into Users(uname,password) values(?,?)";
	    PreparedStatement ps=con.prepareStatement(query);
	    ps.setString(1,uname);
	    ps.setString(2,password);
	    int i=ps.executeUpdate();
		return i;
	 }
		
	 
	 //To Update Password
	 public int updatePassword(String uname,String password) throws SQLException
	 {
		String query="update Users set password=? where uname=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,password);
		ps.setString(2,uname);
		int i=ps.executeUpdate();
		return i;
	 }
	 
	 
	 //To Delete User
	 public int deleteUser(String uname) throws SQLException
	 {
		String query="delete from users where uname=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, uname);
		int i=ps.executeUpdate();
		return i;
	 }
	 
	 
	 //To Retrieve a User
	 public void displayUser(String uname) throws SQLException
	 {
		String query="select * from Users where uname=?";
        PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,uname);
		ResultSet rs=ps.executeQuery();	
		rs.next();
		  System.out.println("User name : "+rs.getString(1));
		  System.out.println("Password: ******");
	 }
	
	 
	 //To Retrieve All Users
	 public void displayAllUsers() throws SQLException
	 {
		String query="Select * from Users";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery(query);
		while(rs.next())
		{  
		  System.out.println("User name : "+rs.getString(1));
		  System.out.println("Password  : "+rs.getString(2));
		  System.out.println(".............................");
		}
	 }
}
