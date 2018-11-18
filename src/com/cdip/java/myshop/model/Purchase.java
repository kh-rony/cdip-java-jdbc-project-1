package com.cdip.java.myshop.model;

import java.util.Date;
import java.util.List;

public class Purchase
{
	private long id;
	private List<Product> products;
	private Customer customer;
	private Date date;

	public Purchase(long id, List<Product> products, Customer customer, Date date)
	{
		this.id = id;
		this.products = products;
		this.customer = customer;
		this.date = date;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(List<Product> products)
	{
		this.products = products;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
}
