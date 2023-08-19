package com.coderscampus;

// POJO = Plain Ol' Java Object!
public class User {
	
	// Constructor for exercise
	User (String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}
	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}
	private String password;
	private String firstName;
	private String lastName;
	private int failedLoginAttempts;
}
