package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Items> {
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemsDAO itemsDAO;
	private Utils utils;
	
	

	public ItemController(ItemsDAO itemsDAO, Utils utils) {
		super();
		this.itemsDAO = itemsDAO;
		this.utils = utils;
	}

	@Override
	public List<Items> readAll() {
		List<Items> items = itemsDAO.readAll();
		for (Items item : items) {
			LOGGER.info(item);
		}		return null;
	}

	@Override
	public Items create() {
		LOGGER.info("Please enter an Item Name");
		String itemName = utils.getString();
		ItemsDAO itemsDAO = new ItemsDAO();
		
		
		LOGGER.info("Please enter the price of the item");
		Double itemPrice = utils.getDouble();
		
		
		Items item = itemsDAO.create(new Items(itemName, itemPrice));
		LOGGER.info("item inputted");		
		return item;
	}

	@Override
	public Items update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemsDAO.delete(id);		
		
	}

}
