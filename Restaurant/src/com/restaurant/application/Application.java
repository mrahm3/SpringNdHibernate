package com.restaurant.application;

import com.restaurant.daos.EmployeeDao;
import com.restaurant.entity.Employee;

public class Application {

	public static void main(String[] args) {
		
		Employee emp=new Employee(104, "Rahman",9891818660L);
		EmployeeDao empDao = new EmployeeDao();
		empDao.add(emp);
		
		
	}

}
