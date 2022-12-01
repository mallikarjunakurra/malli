package com.jdbc.Lab_Test_on_JDBC_Dao;

import java.sql.SQLException;

public interface UsersDao {

    int insertUser(String uname, String password) throws SQLException;
	
    int updatePassword(String uname, String password) throws SQLException;
    
    int deleteUser(String uname) throws SQLException;
    
	void displayUser(String uname) throws SQLException;
	
	void displayAllUsers() throws SQLException;
	
}
