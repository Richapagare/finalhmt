package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.model.Product;
import com.model.User;
import com.utility.Connector;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class DAOOperationImpl implements DAOOperation {

	@Override
	public String authenticateUser(User user) {

		Connection con = Connector.connection();
		// String query=;

		try {

			PreparedStatement ps = con.prepareStatement("select password from register where email=?");
			ps.setString(1, user.getEmail());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(user.getPassword())) {
					return "welcome";

				} // inside if ends

				else {

					return "invalid";

				} // else ends

			} // outside if ends

		} // try ends

		catch (Exception e) {
			e.printStackTrace();
		}

		return "invalid";

	}// authenticateUser ends

	@Override
	public String registerUser(User user) throws SQLException {
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
		ps.setInt(1, user.getEmpNumber());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getRole());
		ps.setString(4, user.getEmail());
		ps.setInt(5, user.getSeniorEmpNumber());
		ps.setString(6, user.getPassword());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return "User Inserted";
		} else {
			return "Not Inserted";
		}
	}

	@Override
	public String changePassword(User user) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("update register set password=? where email=?");
		ps.setString(1, user.getPassword());
		ps.setString(2, user.getEmail());
		int rs = ps.executeUpdate();
		if (rs != 0) {
			return "updated";
		} else {
			return "error";
		}

	}

	@Override
	public ResultSet makeRequest() throws Exception {

		Connection con = Connector.connection();
		// String query=;

		try {

			PreparedStatement ps = con.prepareStatement("select * from stationary");

			ResultSet rs = ps.executeQuery();
			
			return rs;

		} // try ends

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addToCart(Product p) throws Exception {
		Date date=p.getDate();
		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("insert into request values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, p.getRequestId());
		ps.setString(2, p.getEmail());
		ps.setString(3,p.getItemId() );
		ps.setString(4,p.getItemName());
		ps.setInt(5,p.getPrice());
		ps.setInt(6, p.getQuantity());
		ps.setString(7,p.getLink());
		ps.setString(8, p.getStatus());
		ps.setDate(9,sqlDate);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ResultSet getItemInCart() throws Exception {
		
		Connection con = Connector.connection();
		// String query=;

		try {

			PreparedStatement ps = con.prepareStatement("select * from request2");

			ResultSet rs = ps.executeQuery();
			
			return rs;

		} // try ends

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String addProduct(Product p) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("insert into stationary values(?,?,?,?,?)");
		
		ps.setString(1, p.getItemId());
		ps.setString(2, p.getItemName());
		ps.setInt(3, p.getPrice());
		ps.setInt(4, p.getQuantity());
		ps.setString(5, p.getLink());
		
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return "Product Inserted";
		} else {
			return "Not Inserted";
		}

		
	}

	@Override
	public ResultSet getProduct() throws Exception {
		Connection con = Connector.connection();
		// String query=;

		
			PreparedStatement ps = con.prepareStatement("select * from request2");

			ResultSet rs = ps.executeQuery();
			return rs;

		
		
	}

	@Override
	public String approveRequest(String id) throws Exception {
		
	Connection con = Connector.connection();
	
	//String id=p.getItemId();

	PreparedStatement ps = con.prepareStatement("update request2 set status=? where requestId='"+id+"'");
		
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
			
		return "Approved";
	}

	@Override
	public String declineRequest(String id) throws Exception {
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("delete from request where requestId='"+id+"'");
		int rs = ps.executeUpdate();
		if(rs > 0 )
			
		{
					System.out.println("Record Deleted");
		}
				
				
		else
				
		{
					System.out.println("Not Deleted");
		}
		return "declined";
	}

	@Override
	public boolean addCart(Product p) throws Exception {
		// TODO Auto-generated method stub
		Date date=p.getDate();
		 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		Connection con = Connector.connection();
		PreparedStatement ps = con.prepareStatement("insert into request2 values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, p.getRequestId());
		ps.setString(2, p.getEmail());
		ps.setString(3,p.getItemId() );
		ps.setString(4,p.getItemName());
		ps.setInt(5,p.getPrice());
		ps.setInt(6,1);
		ps.setString(7,p.getLink());
		ps.setString(8, p.getStatus());
		ps.setDate(9,sqlDate);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean returnItem(String name) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Connector.connection();
		// String query=;

		
			PreparedStatement ps = con.prepareStatement("select * from request2 where itemname=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return true;
			}
			return false;
		
	}

	@Override
	public int returnQuantity(String name) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Connector.connection();
		// String query=;

		
			PreparedStatement ps = con.prepareStatement("select quantity from request2 where itemname=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			} else {
				return 0;
			}
	}

	@Override
	public boolean updateQuantity(String name) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Connector.connection();
		
		//String id=p.getItemId();

		PreparedStatement ps = con.prepareStatement("update request2 set quantity=quantity+1 where itemname='"+name+"'");
				
		int rs = ps.executeUpdate();
				
		if(rs > 0 )
				
		{
					System.out.println("Record updated");
					return true;
		}
				
				
		else
				
		{
					System.out.println("Not updated");
					return false;
		}
				
			
		}


}// DAOOperationImpl ends
