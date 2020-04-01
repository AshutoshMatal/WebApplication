package com.UserApplication.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.UserApplication.Model.User;
import com.UserApplication.utility.DB_Utility;

public class UserDaoImpl implements UserDao {
	static Connection con;
	static PreparedStatement ps;
//INSERT USER IS IMPLEMENTED 
	@Override
	public int insertUser(User u) {
		int status=0;
		try
		{
			//CONNECTION IS DONE HERE
			con=DB_Utility.getCon();
			//INSERTING A QUERY
			ps=con.prepareStatement("insert into login values(?,?)");
			ps.setString(1,u.getUsername());	
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getName());
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
	@Override
	public User getUser(String username, String pass)
	{ 
		// USER CLASS 
		User c=new User();
		try
		{
			//CONNECTION IS CREATED
			con=DB_Utility.getCon();
			ps=con.prepareStatement("Select * from login where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,pass);

			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));

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