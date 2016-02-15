package com.training.example;

import java.sql.*;
public class CallableExample {

	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:system/tiger@localhost:1521:XE";
			Connection con=DriverManager.getConnection(url);
            CallableStatement stmt=con.prepareCall("call updatePhonenumber(?,?,?)");
            stmt.setInt(1,102);
            stmt.setLong(2,818660L);
            stmt.registerOutParameter(3, java.sql.Types.NUMERIC);
       //     int count=stmt.getUpdateCount();
           stmt.execute();
        //    boolean result=stmt.execute();
            System.out.println(stmt.getInt(3)+ "Row Updated");
            System.out.println("Thanks for updating Phone Number");
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
