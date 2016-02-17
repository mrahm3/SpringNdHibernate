package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.entity.Bill;
import com.restaurant.entity.Item;
import com.restaurant.entity.Orders;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;

public class BillDao implements DAO<Bill> {
private Connection con;
	
	
	
	public BillDao() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(Bill e) {
		String sql = "insert into Bill values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getBillNo());
			pstmt.setTimestamp(2, e.getTime());
			pstmt.setString(3, e.getCustomerName());
			pstmt.setInt(4, e.getNumberOfDiner());
			pstmt.setInt(5, e.getTableNo());
			pstmt.setDouble(6, e.getAmount());
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Bill find(int billNo) {
		String sql = "select * from Bill where billNo= ?";
		PreparedStatement pstmt;
		Bill emp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, billNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){			
				emp = getBill(rs);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}			
		return emp;
		
	}

	@Override
	public List<Bill> findAll() {
		String sql = "select * from Bill";
		PreparedStatement pstmt;
		Bill emp = null;
		List<Bill> empList = new ArrayList<Bill>();
		
		try {
			pstmt = con.prepareStatement(sql);		
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				emp = getBill(rs);
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}




	@Override
	public int delete(int key) {
		String sql = "delete from Bill where BillCode = ?";
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
	public Boolean update(Bill e){
		String sql = "update Bill set Time = ?, customerName= ?," + "numberofDiner=?,tableNo=?," + 
	                   " Amount=?  where billNo = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setTimestamp(1, e.getTime());
			pstmt.setString(2, e.getCustomerName());
			pstmt.setInt(3, e.getNumberOfDiner());
			pstmt.setInt(4, e.getTableNo());
			pstmt.setDouble(5, e.getAmount());
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	private Bill getBill(ResultSet rs)
	{
		Bill e =null;
		try {
			  e=new Bill(rs.getInt("BillNo"),rs.getTimestamp("time"),
					  rs.getString("CustomerName"),
					  rs.getInt("noOfDiner"),
					  rs.getInt("tableNo"),rs.getDouble("amount"));
			 
		} catch (Exception e2) {
			e2.printStackTrace();
		}return e;
	}
	
	public Double generateBillAmount(Integer billNo){
		
		Double amount=0.0;
		OrdersDao odrDao=new OrdersDao();
		ArrayList<Orders> odrList= (ArrayList<Orders>) odrDao.findAllWithSameBillNo(billNo);
		ItemDao itmDAO = new ItemDao();
		Item itmObj = null;
		
		for(Orders odrObj : odrList){
			
			itmObj = itmDAO.find(odrObj.getItemCode());
			amount += (itmObj.getRate() * odrObj.getQuantity());
		}
		return amount;
	}
	
	

}
