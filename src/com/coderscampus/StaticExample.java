package com.coderscampus;

public class StaticExample {
	/*  "static" can either be for a method or variable
	 *  belongs to a class, not an instance of a class
	 *  non-static (no keyword) means it's specific to the instance of the class
	 *  non-static: THIS SPECIFIC HUMAN has an AGE
	 *  static: "Always has been, always will be!"
	 */
	int instanceNumber = 10;
	
	
	public static void main(String[] args) {
		StaticExample staticObject = new StaticExample();
		
		if (staticObject.instanceNumber > 11) {
			System.out.println("Well well! Regaining your units digit, are you...?");
		}
		
		HumanPlus aChild = new HumanPlus();
		aChild.setAge(12);
		System.out.println(aChild.getStageOfLife());
		
		System.out.println("By the way, the minimum age to be an adult is " +
							(HumanPlus.TEENAGER_AGE_MAX + 1) + ".");
		
		HumanPlus anAdult = new HumanPlus();
		anAdult.setAge(20);
		System.out.println(anAdult.getStageOfLife());
		
		
	}
	
	

}
