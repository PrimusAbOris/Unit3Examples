package com.coderscampus;

public class AccessModExample {
	public String hiThereString = "Hi there";
	
	// private, public, or protected
	
	public static void main(String[] args) {
		HumanPlus guyRoss = new HumanPlus();
		guyRoss.age = 28;
		// this will fail, even if it's just a read
		// System.out.println(guyRoss.dharma);

	}

}
