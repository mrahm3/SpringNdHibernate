package com.restaurant.entity;



public class Orders {
	private Integer orderId;
	
	private Integer billNo;
	private Integer itemCode;
	private Integer quantity;
	private Boolean status;
	public Orders(Integer orderId, Integer billNo, Integer itemCode, Integer quantity, Boolean status) {
		super();
		this.orderId = orderId;
		this.billNo = billNo;
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.status = status;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getBillNo() {
		return billNo;
	}
	public void setBillNo(Integer billNo) {
		this.billNo = billNo;
	}
	public Integer getItemCode() {
		return itemCode;
	}
	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	

}
