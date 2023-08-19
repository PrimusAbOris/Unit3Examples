package com.coderscampus;

public class AccessModExample {
	public String hiThereString = "Hi there";
	
	// private, public, or protected
	
	public static void main(String[] args) {
		HumanPlus guyRoss = new HumanPlus();
		System.out.println(); //clearer output
		guyRoss.setAge(-28);
		guyRoss.setAge((int)Math.pow(2, 31));
		guyRoss.setAge(28);
		System.out.println(guyRoss.getAge());
		// this will fail, even if it's just a read
		// System.out.println(guyRoss.dharma);
		
		System.out.println(guyRoss.getStageOfLife());
	}

}
