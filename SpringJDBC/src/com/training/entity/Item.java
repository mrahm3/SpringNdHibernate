package com.training.entity;

import org.springframework.stereotype.Component;

@Component("item")
public class Item {
  private String itemName;

public Item() {
	super();
	// TODO Auto-generated constructor stub
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public Item(String itemName) {
	super();
	this.itemName = itemName;
}

@Override
public String toString() {
	return "Item [itemName=" + itemName + "]";
}
  
  
}
