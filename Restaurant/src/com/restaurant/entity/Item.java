package com.restaurant.entity;

public class Item {
	private Integer itemCode;
   private String name;
   private String itemType;
   private Double rate;
   private Boolean inStock;
   private Boolean isVeg;
   
   
public Item(Integer itemCode, String name, String itemType, Double rate, Boolean inStock, Boolean isVeg) {
	super();
	this.itemCode = itemCode;
	this.name = name;
	this.itemType = itemType;
	this.rate = rate;
	this.inStock = inStock;
	this.isVeg = isVeg;
}


public Integer getItemCode() {
	return itemCode;
}


public void setItemCode(Integer itemCode) {
	this.itemCode = itemCode;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getItemType() {
	return itemType;
}


public void setItemType(String itemType) {
	this.itemType = itemType;
}


public Double getRate() {
	return rate;
}


public void setRate(Double rate) {
	this.rate = rate;
}


public Boolean getInStock() {
	return inStock;
}


public void setInStock(Boolean inStock) {
	this.inStock = inStock;
}


public Boolean getIsVeg() {
	return isVeg;
}


public void setIsVeg(Boolean isVeg) {
	this.isVeg = isVeg;
}
   




   
   
}
