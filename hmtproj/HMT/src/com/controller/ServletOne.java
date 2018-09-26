package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAOOperationImpl;
import com.model.User;
import com.utility.Connector;


public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.sendRedirect("Register.jsp");
		String email=request.getParameter("email");
		String password=request.getParameter("psw");
		
		System.out.println(email);
		System.out.println(password);
		String role=null;
		
		
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		Connection con = Connector.connection();
		try {
			PreparedStatement ps = con.prepareStatement("select role from register where email=?");
			ps.setString(1,email);
			System.out.println("Reached");
			ResultSet rs = ps.executeQuery();
			System.out.println("Reached1");
			while(rs.next())
			{
			role = rs.getString(1);
			System.out.println("Reached2");
			System.out.println(role);
			}
			DAOOperationImpl daoImpl=new DAOOperationImpl();
			String returnedValue=daoImpl.authenticateUser(user);
			
			if(returnedValue.equals("welcome"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("username", email);
				if(role.equals("Admin"))
				{
				RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
				 rd.forward(request, response);
				 return;
				//response.sendRedirect("Home.jsp");
				}
				RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
				 rd.forward(request, response); 
				 return;
			}
			else
			{
				response.sendRedirect("Login.jsp");
			}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}

	


