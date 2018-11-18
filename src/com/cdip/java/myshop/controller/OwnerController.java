package com.cdip.java.myshop.controller;

import com.cdip.java.myshop.dao.OwnerDAO;
import com.cdip.java.myshop.model.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

public class OwnerController
{
	@FXML
	public TextField textFieldName;
	@FXML
	public TextField textFieldPhoneNumber;

	@FXML
	public void createNewOwner(ActionEvent actionEvent)
	{
		Owner owner = new Owner();
		owner.setName(textFieldName.getText());
		owner.setPhoneNumber(textFieldPhoneNumber.getText());

		OwnerDAO ownerDAO = new OwnerDAO();
		ownerDAO.save(owner);

		textFieldName.setText("");
		textFieldPhoneNumber.setText("");
	}

	public List<Owner> getAll()
	{
		OwnerDAO ownerDAO = new OwnerDAO();
		return ownerDAO.findAll();
	}
}
