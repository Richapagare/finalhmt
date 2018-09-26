package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAOOperationImpl;
import com.model.Product;
import com.utility.Connector;

/**
 * Servlet implementation class CartServlet
 */
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOOperationImpl dao=new DAOOperationImpl();
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		System.out.println(email);
		String status="pending";
		List<Product> cartList=new ArrayList<>();
		
		String id=request.getParameter("id");
		System.out.println(id);
		Connection con = Connector.connection();
		Date date=new Date();
		int x=(int)Math.round(Math.random()*1000);
		String requestId="id"+x;

		try {

			PreparedStatement ps = con.prepareStatement("select * from stationary where id='"+id+"'");
			Product product=null;

			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			
				
				String itemname=rs.getString(2);
				boolean exists=dao.returnItem(itemname);//check if an item already exista
				if(exists)
				{
					System.out.println("Inside exists");
					int quantity=dao.returnQuantity(itemname);
					if(quantity>0)//find quantity of existing item
					{
						boolean update=dao.updateQuantity(itemname);
						if(update)
						{
							response.sendRedirect("Cart.jsp");
						}
					}
				}	
				
				else
				{	 
					System.out.println("Inside else");
					product=new Product(requestId,email,rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getString(5), status, date);
						
						boolean inserted=dao.addCart(product);
						if(inserted)
						{
							response.sendRedirect("Cart.jsp");
						}
						else
						{
							response.sendRedirect("index.jsp");
						}
						
						cartList.add(product);
				}
			
				
			
			}
			
			for (Product cart : cartList) 
			{
				System.out.println(cart);
			}
			

		} // try ends

		catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	

	}

	
}
