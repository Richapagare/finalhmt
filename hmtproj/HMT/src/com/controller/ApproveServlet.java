package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.dao.DAOOperationImpl;
import com.model.Product;
import com.utility.Connector;

/**
 * Servlet implementation class ApproveServlet
 */
public class ApproveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAOOperationImpl dao=new DAOOperationImpl();
		HttpSession session=request.getSession(false);
		String id=request.getParameter("id");
		System.out.println(id);
		String str="";
		try 
		{
			 str=dao.approveRequest(id);
		} 
		
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(str.equalsIgnoreCase("approved"))
		{
			System.out.println("yes");
		/*	PrintWriter out=response.getWriter();
			out.println("<html><head>");
			out.println("<body bgcolor='#BBFFFF'>");
			out.println("<h1>Request has been approved</h1>");
			out.println("</body></head></html>");*/
			response.sendRedirect("NewFile.jsp");
		}
		
		else
		{
			System.out.println("No");
		}
		/*Connection con = Connector.connection();
	
		try {

			PreparedStatement ps = con.prepareStatement("update request set status=? where requestId='"+id+"'");
		
			ps.setString(1,"approved");
			
			int rs = ps.executeUpdate();
			
			if(rs > 0 )
			{
				System.out.println("Record updated");
			}
			
			else
			{
				System.out.println("Not updated");
			}
			
		} // try ends

		catch (Exception e) {
			e.printStackTrace();
		}*/
	
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
