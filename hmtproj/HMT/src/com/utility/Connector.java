package com.utility;
import java.sql.Connection;
import java.sql.DriverManager;
public class Connector {

	public static Connection connection() {
		Connection con=null;
		try {

			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			 con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			 return con;
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	
}
