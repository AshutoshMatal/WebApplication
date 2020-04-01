package com.UserApplication.Web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserApplication.Dao.UserDao;
import com.UserApplication.Dao.UserDaoImpl;
import com.UserApplication.Model.User;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	//CONSTRUCTOR IS CREATED
	public LoginServlet() 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{  
		UserDao cd=new UserDaoImpl();
		String userName=request.getParameter("username");
		String password=request.getParameter("password1");
		String submitType=request.getParameter("submit");
		User u=new User();
		u=cd.getUser(userName,password);
		//LOGIN DATA 
		if(submitType.equals("Login"))
		{
			request.setAttribute("message",u.getName());
			//IF THE DATA IS ADD SUCCESSFULLY THE IT WILL SHOW WELCOME PAGE
			request.getRequestDispatcher("Welcome.jsp").forward(request,response);
		}
		//REGISTER DATA 
		else if(submitType.equals("register"))
		{ 
			u=new User();
			u.setName(request.getParameter("name"));
			u.setPassword(password);
			u.setUsername(userName);
			cd.insertUser(u);
			request.setAttribute("successMessage","Registration is done!!!!Plz login to continue");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
		else
		{	//ELSE IT WILL SHOW DATA NOT FOUND MSG
			request.setAttribute("message","Data Not Found!!!!,click on Register");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}


}