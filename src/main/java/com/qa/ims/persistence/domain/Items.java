package com.qa.ims.persistence.domain;

public class Items {
	private long itemId;
	private String itemName;
	private double itemPrice;

	public Items(Long itemId, String itemName, double itemPrice) {

		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		// TODO Auto-generated constructor stub
	}

	public Items(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		// TODO Auto-generated constructor stub
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "id:" + itemId + " Item Name:" + itemName + " Item Price:" + itemPrice;
	}
}
