package com.cdip.java.myshop.dao;

import com.cdip.java.myshop.db.ConnectionFactory;
import com.cdip.java.myshop.model.Owner;
import com.cdip.java.myshop.model.Shop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopDAO
{

	public Shop save(Shop shop)
	{

		System.out.println("Shop Dao save method");
		// save shop in database
		// connect to database
		//

		try
		{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop_db?" + "user=root&password=root");

			Statement statement = connection.createStatement();

			//statement.executeQuery("insert into shop values(" + 123 + ", " + shop.getName() + "," + shop.getLocation() + ")");

			statement.executeUpdate("INSERT INTO shops " + "VALUES (123, " + shop.getName() + ", " + shop.getLocation() + ")");


		}
		catch(Exception ex)
		{
			System.out.println("Exception: " + ex);
		}

		return shop;
	}

	public Shop edit(Shop shop)
	{
		// edit
		return shop;
	}

	public Shop get(long id)
	{
		// get shop by id
		return new Shop();
	}

	public boolean delete()
	{
		// delete shop by id
		return true;
	}

	public List<Owner> findAll()
	{
		try
		{
			Connection connection = ConnectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM owners");
			List<Owner> owners = new ArrayList<Owner>();
			while(rs.next())
			{
				Owner owner = extractOwnerFromResultSet(rs);
				owners.add(owner);
			}
			return owners;
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	private Owner extractOwnerFromResultSet(ResultSet resultSet) throws SQLException
	{
		Owner owner = new Owner();
		owner.setId(resultSet.getInt("id"));
		owner.setName(resultSet.getString("name"));
		owner.setPhoneNumber(resultSet.getString("phone_number"));

		return owner;
	}
}
