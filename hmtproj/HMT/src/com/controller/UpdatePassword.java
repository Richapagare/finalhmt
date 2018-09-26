package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAOOperationImpl;
import com.model.User;


public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	if(session==null)
	{
		response.sendRedirect("index.jsp");
	}
		String email=request.getParameter("email");
		String newPassword=request.getParameter("psw");
		System.out.println(email);
		System.out.println(newPassword);
		//String confirmPassword=request.getParameter("confirm-psw");
		User u = new User();
		u.setEmail(email);
		u.setPassword(newPassword);
		DAOOperationImpl daoImpl=new DAOOperationImpl();
		
		try {
			String	returnedValue = daoImpl.changePassword(u);
			if(returnedValue.equals("updated"))
			{
				response.sendRedirect("Login.jsp");
			}
			else
			{
				response.sendRedirect("Home.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
