package com.internousdev.webproj2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector{
	private static String driverMame="com.mysql.jdbc.Driver";



	private static String url="jdbc:mysql://localhost/testdb";



	private static String user="root";



	private static String password="mysql";


public Connection getConnection(){
	Connection con=null;
	try{
		Class.forName(driverMame);
		con=DriverManager.getConnection(url,user,password);
	}catch (ClassNotFoundException e){
		e.printStackTrace();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return con;
}
}