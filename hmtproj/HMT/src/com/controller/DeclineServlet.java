package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAOOperationImpl;


public class DeclineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeclineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DAOOperationImpl dao=new DAOOperationImpl();
		HttpSession session=request.getSession(false);
		String id=request.getParameter("id");
		System.out.println(id);
		String str="";
		try 
		{
			 str=dao.declineRequest(id);
		} 
		
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(str.equalsIgnoreCase("declined"))
		{
			System.out.println("yes");
			PrintWriter out=response.getWriter();
			out.println("<html><head>");
			out.println("<body bgcolor='#BBFFFF'>");
			out.println("<h1>Request has been declined</h1>");
			out.println("</body></head></html>");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
