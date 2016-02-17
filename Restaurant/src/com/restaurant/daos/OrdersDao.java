package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.restaurant.entity.Orders;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;
import com.restaurant.util.Utility;

public class OrdersDao implements DAO<Orders> {
private Connection con;
	
	
	
	public OrdersDao() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(Orders ord) {
		String sql = "insert into Orders values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, ord.getOrderId());
			pstmt.setInt(2, ord.getBillNo());
			pstmt.setInt(3, ord.getItemCode());
			pstmt.setInt(4, ord.getQuantity());
		//	pstmt.setBoolean(5, Utility.booleanToString(e.getStatus()));
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Orders find(int OrderId) {
		String sql = "select * from Orders where OrderId = ?";
		PreparedStatement pstmt;
		Orders orde = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, OrderId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				orde = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return orde;
		
	}

	@Override
	public List<Orders> findAll() {
		String sql = "select * from Orders";
		PreparedStatement pstmt;
		Orders orde= null;
		List<Orders> ordList = new ArrayList<Orders>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				orde = getItem(rs);
				ordList.add(orde);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ordList;
	}
	
	public List<Orders> findAllWithSameBillNo(int billNo) {
		String sql = "select * from Orders where billNo=?";
		PreparedStatement pstmt;
		Orders orde= null;
		List<Orders> ordList = new ArrayList<Orders>();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, billNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				orde = getItem(rs);
				ordList.add(orde);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ordList;
	}
	
	private Orders getItem(ResultSet rs)
	{
		Orders o =null;
		try {
			  o=new Orders(rs.getInt("orderId"),rs.getInt("billNo"),
					  rs.getInt("itemCode"),
					  rs.getInt("quantity"),
					  rs.getBoolean("status"));
			 
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return o;
	}


	@Override
	public int delete(int key) {
		String sql = "delete from Orders where orderId = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(Orders e){
		String sql = "update Orders set billNo = ?, itemCode = ?," + "quantity=?,status=?," + " where orderId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getBillNo());
			pstmt.setInt(2, e.getItemCode());
			pstmt.setInt(3, e.getQuantity());
			//pstmt.setString(4, e.getItemType());
			//pstmt.setBoolean(5, Utility.booleanToString(e.getStatus()));
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	

}
