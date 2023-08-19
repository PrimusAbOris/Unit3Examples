package com.coderscampus;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		String aString = null;
		
		try {
			String[] stringArray = aString.split(",");
			System.out.println(stringArray);
		} catch (NullPointerException e) {
			System.out.println("There was a null pointer exception, but we caught it.");
		}
		
		
	}
/*
 * Everything is an object in Java, and exceptions are no exception.
 * public class RuntineException extends Exception {
 * public class Throwable implements Serializable {
 * and so on.
 */
}

