package com.cdip.java.myshop.model;

public class Employee
{
	private long id;
	private String name;
	private String phoneNumber;
	private String type;

	public Employee(long id, String name, String phoneNumber, String type)
	{
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.type = type;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
}
