package com.UserApplication.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Utility implements utility{
	
	//CREATING A CONNECTION
	public static Connection getCon()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//DRIVER MANAGER IS USED
			con=DriverManager.getConnection(connUrl,userName,password);
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();

		}
		return con;
	}
}

