package com.cdip.java.myshop.controller;

import com.cdip.java.myshop.dao.OwnerDAO;
import com.cdip.java.myshop.dao.ShopDAO;
import com.cdip.java.myshop.model.Owner;
import com.cdip.java.myshop.model.Shop;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

public class ShopController
{
	@FXML
	public TextField textFieldShopName;
	@FXML
	public TextField textFieldShopLocation;

	@FXML
	public void createNewShop(ActionEvent actionEvent)
	{
		Shop shop = new Shop();
		shop.setName(textFieldShopName.getText());
		shop.setLocation(textFieldShopLocation.getText());

		ShopDAO shopDAO = new ShopDAO();
		shopDAO.save(shop);

		textFieldShopName.setText("");
		textFieldShopLocation.setText("");
	}

	public List<Owner> getAll()
	{
		ShopDAO shopDAO = new ShopDAO();
		return shopDAO.findAll();
	}
}
