package com.UserApplication.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Utility{
	public static String userName="Steady";
	public static String password="1234";
	//CREATING A CONNECTION
	public static Connection getCon()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//DRIVER MANAGER IS USED
			con=DriverManager.getConnection("jdbc:mysql://localhost/bridgelabz","root","abc");
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();

		}
		return con;
	}
}

