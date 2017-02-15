package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {

	//public static void main(String args[])
	//{
		
		public Connection getconnections() 
		{
			
			Connection con=null;
			try {
			Class.forName("com.mysql.jdbc.Driver");
			
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springsample","root","root");
			
			}
			 catch(ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
			
		}
	//}
}
