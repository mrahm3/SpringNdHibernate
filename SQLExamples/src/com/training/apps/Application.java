package com.training.apps;

import com.training.entity.Customer;

import java.util.ArrayList;

//import com.training.utils.SqlConnection;
import com.training.daos.CustomerDAO;

public class Application {

	public static void main(String[] args) {
		//System.out.println(SqlConnection.getOracleConnection());
//  Customer cust=new Customer(117,"BlackBelt","black@gmail.com",987);
  
  CustomerDAO dao=new CustomerDAO();
 // int rowAdded=dao.add(cust);
 // System.out.println(rowAdded + ":= Row Added");
  ArrayList<Customer> cust1=(ArrayList<Customer>)dao.findAll();
  for(Customer cust: cust1)
	  System.out.println(cust.showCustomer());
 // Customer foundCustomer=dao.find(103);
//  System.out.println(foundCustomer.showCustomer());
	}

}
