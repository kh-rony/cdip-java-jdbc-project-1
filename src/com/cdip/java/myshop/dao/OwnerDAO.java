package com.cdip.java.myshop.dao;

import com.cdip.java.myshop.db.ConnectionFactory;
import com.cdip.java.myshop.model.Owner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OwnerDAO
{
	private static String INSERT_QUERY = "INSERT INTO owners(name, phone_number) VALUES(?, ?)";

	public Owner save(Owner owner)
	{
		// save owner in database
		// connect to database
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try
		{
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(INSERT_QUERY, Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, owner.getName());
			preparedStatement.setString(2, owner.getPhoneNumber());

			preparedStatement.executeUpdate();

			ResultSet resultSet = preparedStatement.getGeneratedKeys();

			if(resultSet.next())
			{
				long newId = resultSet.getLong(1);
				System.out.println("id: " + newId);
			}

		}
		catch(Exception ex)
		{
			throw new RuntimeException("Error creating owner: ", ex);
		}
		finally
		{
			try
			{
				preparedStatement.close();
				connection.close();
			}
			catch(Exception e)
			{
				//
			}
		}

		return owner;
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
