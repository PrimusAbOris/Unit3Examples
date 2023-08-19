package com.coderscampus;

public class UserApplication {
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User[] users = new User[13]; // size 13, [0] to [12]
		// this has to be instantiated before the for loop
		
		for (int i = 0; i < 13; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1), "name" + (i+1));
		}
		
		//User guyAcct = userService.createUser({"guy.ross.rit@gmail.com", "ihatetheCSdept", "Guy Ross"});
		//System.out.println(guyAcct.getUsername()); // breakpoint
		System.out.println(users);
		
		// The parse exercise continued
		String [] exampleArray = UserService.parseText("exampleUsername,examplePassword,exampleName");
		for (String example : exampleArray) {
			System.out.println(example);
		}
	}
}
