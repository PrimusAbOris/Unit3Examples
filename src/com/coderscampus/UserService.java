package com.coderscampus;

public class UserService {
	
	public User createUserArray (String[] stringArray) {
		// The array exercise
		User user = new User();
		user.setUsername(stringArray[0]);
		user.setPassword(stringArray[1]);
		user.setName(stringArray[2]);
		return user;
	}
	
	public static String[] parseText(String input) {
		// The parse exercise
		String[] inputArray = input.split(",");
		return inputArray;
		// See UserApplication.java for usage
	}
	
	public User createUser (String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
}
