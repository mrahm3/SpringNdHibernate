package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.restaurant.entity.Users;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;

public class UsersDao implements DAO<Users> {
	
	private Connection con;

	public UsersDao() {
		super();
		con=SqlConnection.getOracleConnection();
	}
	
	@Override
	public int add(Users e) {
	
	String sql="insert into Users values(?,?,?)";
	int rowAdded=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, e.getEmpId());
			pstmt.setString(2, e.getPassword());
			pstmt.setString(3, e.getRole());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		return rowAdded;
	}
	
	@Override
	public Users find(int key) {
		String sql="select * from users where empId=?";
		Users cust=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				
				String password=rs.getString("password");
				String role=rs.getString("Role");
				
				
				cust= new Users(key,password,role);
				
				
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		
	
		return cust;
	}
	
	@Override
	public List<Users> findAll() {
		ArrayList<Users> custList=new ArrayList<Users>();
		String sql="select * from users";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{				
			    Users cust=getEmpId(rs); 	
			    custList.add(cust);
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return custList;
	}

	
	
	/*@Override
	public int delete(int key) {
		
		String sql="delete from users where empId=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		try {
			pstmt=con.prepareCall(sql);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}*/
	
/*	public boolean validateUser(Users us){
		Users newUs=find(us.getEmpId());
		if(newUs!=null)
		{
			if(newUs.getPassword().equals(us.getPassword()) && (newUs.getRole().equals(us.getRole())))
		}
		return true;
		
	}*/
	

	@Override
	public int delete(int key) {
		String sql = "delete from User where userId = ?";
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
	public Boolean update(Users e){
		String sql = "update users set password = ?, role = ?  where empId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, e.getPassword());
			pstmt.setString(2, e.getRole());
			pstmt.setInt(3, e.getEmpId());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	public boolean validateUser(Users us){
		
		Users newUs = find(us.getEmpId());
		if(newUs!=null){
			if(newUs.getPassword().equals(us.getPassword()) && newUs.getRole().equals(us.getRole()))
				return true;
		}
		
		return false;
	}
	
/*	private Users getUsers(ResultSet rs){
		
		
		Users emp = null;
		try {
			emp = new Users(rs.getInt("EmpId"), rs.getString("password"), rs.getString("role"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}*/
	
	private Users getEmpId(ResultSet rs) {
		Users cust=null;
			try {
			//	PreparedStatement pstmt=con.prepareStatement(sql);
				//pstmt.setInt(1,key);
			//	ResultSet rs=pstmt.executeQuery();
				
					int empId=rs.getInt("empId");
					String password=rs.getString("password");
					//String emai_Id=rs.getString("email");
				String role=rs.getString("Role");
					
					cust= new Users(empId,password,role);
					
					
				
			} catch (Exception e) {
	                 e.printStackTrace();
			}
			return cust;
		}
	
	
	

}
