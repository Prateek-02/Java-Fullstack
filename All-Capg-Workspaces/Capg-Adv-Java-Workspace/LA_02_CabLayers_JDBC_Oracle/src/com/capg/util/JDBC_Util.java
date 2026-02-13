package com.capg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Util {
	public static Connection getConnection() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String userName = "scott"; 
		String password = "tiger";	 
		Class.forName(driver);
		
		return DriverManager.getConnection(url,userName,password);
	}

}
