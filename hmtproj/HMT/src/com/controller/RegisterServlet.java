package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DAOOperationImpl;
import com.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int employeeNumber=Integer.parseInt(request.getParameter("empnumber"));
		String name=request.getParameter("name");
		String role=request.getParameter("role");
		String email=request.getParameter("email");
		int sempnumber=Integer.parseInt(request.getParameter("sempnumber"));
		String password=request.getParameter("psw");
		String confirmPassword=request.getParameter("psw-repeat");
		User u = new User(employeeNumber, name, role, email,password,sempnumber);
		DAOOperationImpl daoImpl=new DAOOperationImpl();
		try {
			String returnedValue=daoImpl.registerUser(u);
			if(returnedValue.equals("User Inserted"))
			{
				response.sendRedirect("Login.jsp");
			}
			else
			{
				response.sendRedirect("Register.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
