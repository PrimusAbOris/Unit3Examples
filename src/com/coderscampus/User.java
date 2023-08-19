package com.coderscampus;

// POJO = Plain Ol' Java Object!
public class User {
	
	// Constructor for exercise
	User (String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	// Black constructor
	User () {
		System.out.println("User created.");
	}
	
	// Variables, getters, and setters
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if (username != null) {
			this.username = username;
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}
	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}
	private String password;
	private int failedLoginAttempts;
}
