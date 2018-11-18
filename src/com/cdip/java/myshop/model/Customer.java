package com.cdip.java.myshop.model;

public class Customer
{
	private long id;
	private int phoneNumber;
	private String name;

	public Customer(long id, int phoneNumber, String name)
	{
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
