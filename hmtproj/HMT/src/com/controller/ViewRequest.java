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

/**
 * Servlet implementation class ViewRequest
 */
public class ViewRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAOOperationImpl obj = new DAOOperationImpl();
		try {
			ResultSet rs =obj.getProduct();
		
			/*	while(rs.next())
			{
				System.out.println("Hello");
				System.out.println(rs.getString(4));
			}
			*/
			
			HttpSession session2 = request.getSession();
			session2.setAttribute("result", rs);		
			response.sendRedirect("ViewRequest.jsp");
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
