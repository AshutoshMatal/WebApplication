package com.UserApplication.Dao;

import com.UserApplication.Model.User;

public interface UserDao 
{
	public int insertUser(User u);
	public User getUser(String username,String password);
}