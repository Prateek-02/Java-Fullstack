package com.corejava.layers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CabDAO {
	int i;            // 100  myjava 100  C
	public int addCab(CabBean cabBean) throws ClassNotFoundException {
		
		System.out.println("Cab DAO Layer");
		System.out.println("CabID: "+cabBean.getCarId());
		System.out.println("CarName: "+cabBean.getName());
		System.out.println("CarPrice: "+cabBean.getPrice());
		
		try {
			Connection conn = null;
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String driver = "oracle.jdbc.driver.OracleDriver";
			String userName = "scott"; 
			String password = "tiger";	 
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,userName,password);
		    String query="insert into cab values(?,?,?,?)";
		        
		    PreparedStatement pstmt=conn.prepareStatement(query);
		    pstmt.setInt(1, cabBean.getCarId()); 
		    pstmt.setString(2,cabBean.getName()); 
		    pstmt.setDouble(3,cabBean.getPrice()); 
		    pstmt.setString(4, cabBean.getCategory()); 
		        
		    i= pstmt.executeUpdate();
		}
		
		catch(SQLException e) {
	    	  System.out.println(e);
		}
		return i;
	}
}
