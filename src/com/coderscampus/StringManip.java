package com.coderscampus;

public class StringManip {

	public static void main(String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
			
			String[] stringArray = arg.split(",");
			System.out.println(stringArray);
			
			for (String number : stringArray) {
				System.out.println(number);
			}
		}

	}

}
