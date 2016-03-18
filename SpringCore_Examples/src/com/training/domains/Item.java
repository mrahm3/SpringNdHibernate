package com.training.domains;

public class Item {

	
	private int itemNumber;
	private String itemName;
	private double ratePerUnit;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemNumber, String itemName, double ratePerUnit) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit + "]";
	}
	
	
}
