package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Customer;
import com.training.entity.Item;
import com.training.entity.ServiceRequest;

public class ServiceRequestRowMapper implements RowMapper<ServiceRequest> {

	@Override
	public ServiceRequest mapRow(ResultSet rs, int rowCount) throws SQLException {
		ServiceRequest sr= new ServiceRequest();
		Customer cust = new Customer();
		Item item = new Item();
		
		cust.setCustomerName(rs.getString("customername"));
		
		
		item.setItemName(rs.getString("producttype"));
		
		sr.setCust(cust);
		sr.setProduct(item);
		
		sr.setDescription(rs.getString("description"));
		cust.setMobileNumber(rs.getLong("MobileNumber"));
		sr.setComplainId(rs.getInt("ComplainId"));
		
		
		return sr;
	}

}