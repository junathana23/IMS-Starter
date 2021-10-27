package com.qa.ims.persistence.domain;

public class Order {
	private long orderId;
	private long CustId;
	private double total;
	private int itemQuant;
	private Customer customer;
	private Items item;
	
	
	
	
	
	

	public Order(long orderId, Customer customer, Items item) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.item = item;
	}
	public Order(long custId, double total, Customer customer, Items item, int itemQuant) {
		super();
		CustId = custId;
		this.total = total;
		this.customer = customer;
		this.item = item;
	    this.itemQuant = itemQuant;
	}
	public Order(long orderId, long custId, double total, Customer customer, Items item, int itemQuant) {
		super();
		this.orderId = orderId;
		CustId = custId;
		this.total = total;
		this.customer = customer;
		this.item = item;
		this.itemQuant = itemQuant;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getCustId() {
		return CustId;
	}
	public void setCustId(long custId) {
		CustId = custId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getItemQuant() {
		return itemQuant;
	}
	public void setItemQuant(int itemQuant) {
		this.itemQuant = itemQuant;
	}

	
	
}
