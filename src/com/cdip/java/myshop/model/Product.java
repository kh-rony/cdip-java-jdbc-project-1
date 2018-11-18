package com.cdip.java.myshop.model;

import java.util.Date;

public class Product
{
	private String barcode;
	private String name;
	private Date mfgDate;
	private Date expDate;
	private float price;

	private Category category;

	public Product(String barcode, String name, Date mfgDate, Date expDate, float price, Category category)
	{
		this.barcode = barcode;
		this.name = name;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.price = price;
		this.category = category;
	}

	public String getBarcode()
	{
		return barcode;
	}

	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getMfgDate()
	{
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate)
	{
		this.mfgDate = mfgDate;
	}

	public Date getExpDate()
	{
		return expDate;
	}

	public void setExpDate(Date expDate)
	{
		this.expDate = expDate;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}
}