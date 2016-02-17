package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.restaurant.util.*;

import com.restaurant.entity.Employee;
//import com.restaurant.entity.Users;
import com.restaurant.ifaces.DAO;
import com.restaurant.util.SqlConnection;

public class EmployeeDao implements DAO<Employee> {
	
	private Connection con;

	public EmployeeDao() {
		super();
		con=SqlConnection.getOracleConnection();
	}
	
	@Override
	public int add(Employee e) {
	
	String sql="insert into employee values(?,?,?)";
	int rowAdded=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, e.getEmpId());
			pstmt.setString(2, e.getName());
			pstmt.setLong(3, e.getEmpMobile());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		return rowAdded;
	}
	
	
	@Override
	public Employee find(int key) {
		String sql="select * from employee where empId=?";
		Employee cust=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				
				String name=rs.getString("empName");
				Long empMobile=rs.getLong("empMobile");
				
				
				cust= new Employee(key,name,empMobile);
				
				
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return cust;
	}
	
	@Override
	public List<Employee> findAll() {
		ArrayList<Employee> custList=new ArrayList<Employee>();
		String sql="select * from employee";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,key);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{				
			    Employee cust=getEmpId(rs); 	
			    custList.add(cust);
			}
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return custList;
	}

	private Employee getEmpId(ResultSet rs) {
		Employee cust=null;
		try {
		//	PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,key);
		//	ResultSet rs=pstmt.executeQuery();
			
				int empId=rs.getInt("empId");
				String Name=rs.getString("empName");
				//String emai_Id=rs.getString("email");
				Long empMobile=rs.getLong("empMobile");
				
				cust= new Employee(empId,Name,empMobile);
				
				
			
		} catch (Exception e) {
                 e.printStackTrace();
		}
		return cust;
	}
	@Override
	public Boolean update(Employee e){
		String sql = "update users set password = ?, role = ?  where empId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, e.getName());
			pstmt.setLong(2, e.getEmpMobile());
			pstmt.setInt(3, e.getEmpId());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	@Override
	public int delete(int key) {
		String sql="delete from employee where empId=?";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
