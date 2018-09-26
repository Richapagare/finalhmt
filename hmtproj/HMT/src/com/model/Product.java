package com.model;

import java.util.Date;

public class Product {
String requestId;
String email;
 String itemId;
 String itemName;
 int price;
 int quantity;
 String link;
 String status;
 Date date;
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getDate() {
	return date;
}
public Product(String requestId, String email, String itemId, String itemName, int price, String link, String status,
		Date date) {
	super();
	this.requestId = requestId;
	this.email = email;
	this.itemId = itemId;
	this.itemName = itemName;
	this.price = price;
	this.link = link;
	this.status = status;
	this.date = date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Product [requestId=" + requestId + ", email=" + email + ", itemId=" + itemId + ", itemName=" + itemName
			+ ", price=" + price + ", quantity=" + quantity + ", link=" + link + ", status=" + status + ", date=" + date
			+ "]";
}
public Product(String requestId, String email, String itemId, String itemName, int price, int quantity, String link,
		String status, Date date) {
	super();
	this.requestId = requestId;
	this.email = email;
	this.itemId = itemId;
	this.itemName = itemName;
	this.price = price;
	this.quantity = quantity;
	this.link = link;
	this.status = status;
	this.date = date;
}
public Product( String itemId, String itemName, int price, int quantity, String link) {
	
	
	this.itemId = itemId;
	this.itemName = itemName;
	this.price = price;
	this.quantity = quantity;
	this.link = link;
	
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

 

 
}
