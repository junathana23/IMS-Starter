package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.dao.OrderdetailsDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderdetailsDAO orderdetailsDAO;
	private Utils utils;
	
	
	//return OrderdetailsDAO.create(order);
	
	


	public OrderController(OrderdetailsDAO orderdetailsDAO, Utils utils) {
		super();
		this.orderdetailsDAO = orderdetailsDAO;
		this.utils = utils;
	}
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderdetailsDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	
	
	@Override
	public Order create() {
	
		
		;
		LOGGER.info("Please enter a Customer ID");
		Long custID = utils.getLong();
		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = customerDAO.read(custID);

		
		LOGGER.info("Please enter an the item id");
		Long itemid = utils.getLong();
		ItemsDAO itemsDAO = new ItemsDAO();
		Items item = itemsDAO.read(itemid);
				
		
		LOGGER.info("Please enter the qauntity of items");
		Long itemQuant = utils.getLong();
		
		
		Order order = orderdetailsDAO.create(new Order(itemQuant, customer, item));
		LOGGER.info("order created");
		return order;
		
	}

	@Override
	public Order update() {
		LOGGER.info("please enter U if you would like to update an order, A to add an item");// TODO Auto-generated method stub
		String reply = utils.getString();
		return null ;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long id = utils.getLong();
		return orderdetailsDAO.delete(id);		
		
	}

}
