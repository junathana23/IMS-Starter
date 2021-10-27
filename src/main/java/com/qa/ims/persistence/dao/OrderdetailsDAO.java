package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.DBUtils;

public class OrderdetailsDAO implements Dao<Order> {

	public static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public Order modelFromResultSet(ResultSet resultSet) throws SQLException {
		int itemQuant = resultSet.getInt("itemQuant");
		double total = resultSet.getDouble("total");
		
		
		Long Orderid = resultSet.getLong("OrderId");
		
		Long Custid = resultSet.getLong("custID");
		String firstName  = resultSet.getString("FirstName");
		String surname = resultSet.getString("Surname");
		Customer customer = new Customer(Custid, firstName, surname);
		
		Long id = resultSet.getLong("itemId");
		String itemName = resultSet.getString("itemName");
		double itemPrice = resultSet.getDouble("itemPrice");
		Items item = new Items(id, itemName, itemPrice);
		
		return new Order(Orderid, total, customer,item, itemQuant);
	}
	
	



	@Override
	public List<Order> readAll() {
		// TODO Auto-generated method stub
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM imsorders");) {
			List<Order> orderspec = new ArrayList<>();
			while (resultSet.next()) {
				orderspec.add(modelFromResultSet(resultSet));
			}
			return orderspec ;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
		
	}

	@Override
	public Order read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order create(Order t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order update(Order t) {
		// TODO Auto-generated method stub
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("UPDATE imsorders SET itemQuant = ?, total  = ? WHERE id = ?");) {
			statement.setInt(2, t.getItemQuant());
			statement.setDouble(1, t.getTotal()); 
			statement.executeUpdate();
			return read(t.getOrderId());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM items WHERE id = ?");) {
			statement.setLong(1, id);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e);
		return 0;
	}
}
	
}


