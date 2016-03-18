package com.training.domains;

import java.util.List;

public class Invoice {

	
	private Customer cust;
	private Long invoiceNumber;
	
	
	private List<Item> itemList;
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(Customer cust, Long invoiceNumber) {
		super();
		this.cust = cust;
		this.invoiceNumber = invoiceNumber;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	@Override
	public String toString() {
		return "Invoice [cust=" + cust + ", invoiceNumber=" + invoiceNumber + "]";
	}
	
	
	
}
