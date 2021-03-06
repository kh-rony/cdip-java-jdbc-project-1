package com.cdip.java.myshop.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory
{
	public static final String URL = "jdbc:mysql://localhost:3306/cdip-java-jdbc-project-1";
	public static final String USER = "root";
	public static final String PASSWORD = "";

	/**
	 * Get a connection to database
	 *
	 * @return Connection object
	 */
	public static Connection getConnection()
	{
		try
		{
			//DriverManager.registerDriver(new Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch(SQLException ex)
		{
			throw new RuntimeException("Error connecting to the database", ex);
		}
		catch(ClassNotFoundException e)
		{
			throw new RuntimeException("Error loading JDBC driver", e);
		}
	}
}