package com.model;

public class User {

	private int empNumber;
	private String userName;
	private String role;
	private String email;
	private String password;
	private int seniorEmpNumber;
	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSeniorEmpNumber() {
		return seniorEmpNumber;
	}
	public void setSeniorEmpNumber(int seniorEmpNumber) {
		this.seniorEmpNumber = seniorEmpNumber;
	}
	@Override
	public String toString() {
		return "User [empNumber=" + empNumber + ", userName=" + userName + ", role=" + role + ", email=" + email
				+ ", password=" + password + ", seniorEmpNumber=" + seniorEmpNumber + "]";
	}
	public User(int empNumber, String userName, String role, String email, String password, int seniorEmpNumber) {
		super();
		this.empNumber = empNumber;
		this.userName = userName;
		this.role = role;
		this.email = email;
		this.password = password;
		this.seniorEmpNumber = seniorEmpNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
