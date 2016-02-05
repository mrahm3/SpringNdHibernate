package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Customer;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class CustomerDAO implements DAO<Customer> {

private Connection con;
	public CustomerDAO() {
		super();
		// TODO Auto-generated constructor stub
		con=SqlConnection.getOracleConnection();
		}
	
	@Override
	public int add(Customer t) {
	
	String sql="insert into customer values(?,?,?,?)";
	int rowAdded=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, t.getCustomerId());
			pstmt.setString(2, t.getCustomerName());
			pstmt.setString(4, t.getEmai_Id());
			pstmt.setLong(3, t.getHandPhone());
			rowAdded=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	  
	



	@Override
	public Customer find(int key) {
		String sql="select * from customer where CustomerId=?";
		Customer cust=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				
				String customerName=rs.getString("customerName");
				String emai_Id=rs.getString("email");
				Long handPhone=rs.getLong("handPhone");
				
				cust= new Customer(key,customerName,emai_Id,handPhone);
				
				
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return cust;
	}
	private Customer getCustomer(ResultSet rs)
	{
		Customer cust=null;
		try {
		//	PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,key);
		//	ResultSet rs=pstmt.executeQuery();
			
				int customerId=rs.getInt("customerId");
				String customerName=rs.getString("customerName");
				String emai_Id=rs.getString("email");
				Long handPhone=rs.getLong("handPhone");
				
				cust= new Customer(customerId,customerName,emai_Id,handPhone);
				
				
			
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return cust;
	}

	@Override
	public List<Customer> findAll() {
		ArrayList<Customer> custList=new ArrayList<Customer>();
		String sql="select * from customer";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{				
			    Customer cust=getCustomer(rs); 	
			    custList.add(cust);
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return custList;
	}

	@Override
	public int update(int key) {
		
		return 0;
	}

	@Override
	public int delete(int key) {
		
		return 0;
	}

	

	
}
