package com.dao;

import java.sql.ResultSet;

import com.model.Product;
import com.model.User;

public interface DAOOperation {

	public String authenticateUser(User user);
	public String registerUser(User user) throws Exception;
	public String changePassword(User user) throws Exception;
	public ResultSet makeRequest() throws Exception;
	public boolean addToCart(Product p) throws Exception;
	public ResultSet getItemInCart() throws Exception;
	public String addProduct(Product p) throws Exception;
	public ResultSet getProduct() throws Exception;
	public String approveRequest(String id) throws Exception;
	public String declineRequest(String id) throws Exception;
	
	public boolean addCart(Product p) throws Exception;
	public boolean returnItem(String name) throws Exception;
	public int returnQuantity(String name) throws Exception;
	public boolean updateQuantity(String name) throws Exception;
	
}
