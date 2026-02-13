package com.corejava.layers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capg.util.JDBC_Util;

public class CabDAO {
	int i;            
	public int addCab(CabBean cabBean) throws Exception {
		
		System.out.println("Cab DAO Layer");
		System.out.println("CabID: "+cabBean.getCarId());
		System.out.println("CarName: "+cabBean.getName());
		System.out.println("CarPrice: "+cabBean.getPrice());
		
		try {
			Connection conn = JDBC_Util.getConnection();
			
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
	
	public CabBean getCab(int id) throws Exception{
		CabBean cb = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = JDBC_Util.getConnection();
			
			String query="select * from cab where carid = ?";
	        
		    pstmt=conn.prepareStatement(query);
		    pstmt.setInt(1 , id);
		    
		    ResultSet rs = pstmt.executeQuery();
		    
		    while(rs.next()){
		    	cb = new CabBean();
		    	cb.setCarId(rs.getInt(1));
		    	cb.setName(rs.getString("name"));
		    	cb.setPrice(rs.getDouble(3));
		    	cb.setCategory(rs.getString("category"));
		    }
		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return cb;
		
	}
	
	
	public int updateCab(int id , String newname) throws Exception {
		int status = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = JDBC_Util.getConnection();
			
			String query="UPDATE CAB SET NAME = ? WHERE carid = ?";
	        
		    pstmt=conn.prepareStatement(query);
		    
		    pstmt.setString(1 ,  newname);
		    pstmt.setInt(2 , id);
		    
		    
		    status = pstmt.executeUpdate();
		    		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return status;
	}
	
	public int deleteCab(int id) throws Exception {
		int status = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = JDBC_Util.getConnection();
			
			String query="DELETE FROM CAB WHERE carid = ?";
	        
		    pstmt=conn.prepareStatement(query);
		    
		    pstmt.setInt(1 , id);		    
		    
		    status = pstmt.executeUpdate();
		    		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return status;
	}
	
	
}
