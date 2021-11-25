package com.tfgarage.model;

public class Account {
	private String username;
	private String password;
	private String position;
	private Employee employee;

	public Account() {
	}

	public Account(String username, String password, String position, Employee employee) {
		this.username = username;
		this.password = password;
		this.position = position;
		this.employee = employee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
