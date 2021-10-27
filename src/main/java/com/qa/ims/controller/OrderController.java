package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderController implements CrudController {
	public static final Logger LOGGER = LogManager.getLogger();
	
	//return OrderdetailsDAO.create(order);
	
	
	@Override
	public List readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update() {
		LOGGER.info("please enter U if you would like to update an order, A to add an item");// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
