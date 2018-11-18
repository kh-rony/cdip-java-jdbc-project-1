package com.cdip.java.myshop.model;

public class Supplier
{
	private long id;
	private String name;
	private String location;

	public Supplier(long id, String name, String location)
	{
		this.id = id;
		this.name = name;
		this.location = location;
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

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}
}
