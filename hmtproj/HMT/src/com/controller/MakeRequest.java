package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAOOperationImpl;
import com.sun.javafx.scene.control.skin.SeparatorSkin;

/**
 * Servlet implementation class MakeRequest
 */
public class MakeRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOOperationImpl dao=new DAOOperationImpl();
		try {
			ResultSet rs= dao.makeRequest();
			
			HttpSession session1=request.getSession(false);
			session1.setAttribute("result", rs);
			
			String button=request.getParameter("button");
			
			if(button.equals("MakeRequest")){
		
			response.sendRedirect("MakeRequest.jsp"); 
			
			}
			
			if(button.equals("DeleteRequest"))
			{
				response.sendRedirect("DeleteRequest.jsp"); 
			}
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
		
	}

	
}
