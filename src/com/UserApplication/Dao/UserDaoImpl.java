package com.UserApplication.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.UserApplication.Model.User;
import com.UserApplication.utility.DB_Utility;

public class UserDaoImpl {
	static Connection con;
	static PreparedStatement ps;
//INSERT USER IS IMPLEMENTED 
	public static int insertUser(User u) {
		int status=0;
		try
		{
			//CONNECTION IS DONE HERE
			con=DB_Utility.getCon();
			//INSERTING A QUERY
			ps=con.prepareStatement("INSERT INTO login" + "  (username,name,password,emailId,country) VALUES "
					+ " (?, ?, ?, ?,?);");
			ps.setString(1,u.getUsername());
			ps.setString(2,u.getName());
			ps.setString(3,u.getPassword());
			ps.setString(4,u.getEmailId());
			ps.setString(5,u.getCountry());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
//GET USER  IS IMPLEMENTED
	public static User validateUser(String username, String password)
	{ 
		// USER CLASS 
		User c=new User();
		try
		{
			//CONNECTION IS CREATED
			con=DB_Utility.getCon();
			ps=con.prepareStatement("select name, emailId, country from login where username = ? and password = ?");
			ps.setString(1,username);
			ps.setString(2,password);

			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
				c.setEmailId(rs.getString(4));
				c.setCountry(rs.getString(5));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return c;
	}

}