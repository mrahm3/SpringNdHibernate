package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.entity.Item;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;

public class ItemDao implements DAO<Item> {
private Connection con;
	
	
	
	public ItemDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(Item e) {
		String sql = "insert into Item values (?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getItemCode());
			pstmt.setString(2, e.getName());
			pstmt.setString(3, e.getItemType());
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Item find(int userId) {
		String sql = "select * from User where userId = ?";
		PreparedStatement pstmt;
		Item emp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				emp = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return emp;
		
	}

	@Override
	public List<Item> findAll() {
		String sql = "select * from Item";
		PreparedStatement pstmt;
		Item emp = null;
		List<Item> empList = new ArrayList<Item>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				emp = getItem(rs);
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	private Item getItem(ResultSet rs) {
		return null;
	}



	@Override
	public int delete(int key) {
		String sql = "delete from item where itemCode = ?";
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
	public Boolean update(Item e){
		String sql = "update Item set name = ?, type = ?," + "rate=?,inStock=?," + " isveg=?  where itemCode = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getItemCode());
			pstmt.setString(2, e.getName());
			pstmt.setString(3, e.getItemType());
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	

}
