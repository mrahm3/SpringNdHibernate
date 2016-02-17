package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.restaurant.entity.DiningTable;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;
import com.restaurant.util.Utility;

public class DiningTableDao implements DAO<DiningTable> {
private Connection con;
	
	
	
	public DiningTableDao() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(DiningTable ord) {
		String sql = "insert into DiningTable values (?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, ord.getTableNo());
			pstmt.setInt(2, ord.getEmpId());
		
		//	pstmt.setBoolean(5, Utility.booleanToString(e.getStatus()));
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public DiningTable find(int tableNo) {
		String sql = "select * from DiningTable where tableNo = ?";
		PreparedStatement pstmt;
		DiningTable orde = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, tableNo);
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
	public List<DiningTable> findAll() {
		String sql = "select * from DiningTable";
		PreparedStatement pstmt;
		DiningTable orde= null;
		List<DiningTable> ordList = new ArrayList<DiningTable>();
		
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
	private DiningTable getItem(ResultSet rs)
	{
		DiningTable o =null;
		try {
			  o=new DiningTable(rs.getInt("tableNo"),rs.getInt("empId")	);
			 
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return o;
	}


	@Override
	public int delete(int key) {
		String sql = "delete from DiningTable where tableNo = ?";
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
	public Boolean update(DiningTable e){
		String sql = "update DiningTable set billNo = ?, itemCode = ?," + "quantity=?,status=?," + " where orderId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getTableNo());
			pstmt.setInt(2, e.getEmpId());
			
			//pstmt.setBoolean(5, Utility.booleanToString(e.getStatus()));
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	

}
