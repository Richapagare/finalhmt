package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DAOOperationImpl;
import com.model.Product;
import com.model.User;


public class ProductServlet extends HttpServlet {

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemId=request.getParameter("itemId");
		String itemName=request.getParameter("itemName");
		
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		String link=request.getParameter("link");
		
		Product p = new Product(itemId, itemName, price, quantity, link);
		DAOOperationImpl daoImpl=new DAOOperationImpl();
		try {
			String returnedValue=daoImpl.addProduct(p);
			if(returnedValue.equals("Product Inserted"))
			{
				System.out.println("inserted");
				response.sendRedirect("Admin.jsp");
			}
			else
			{
				System.out.println("not inserted");
				response.sendRedirect("Product.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



	}


