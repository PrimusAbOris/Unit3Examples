package com.coderscampus;

/* WARNING: CREATES HUMANS
 * Based on the previous Human class in the Week3 repository
 */

public class HumanPlus {
	// Static variables (Class variables)
	static int TEENAGER_AGE_MIN = 13;
	static int TEENAGER_AGE_MAX = 19;
	static int SENIOR_AGE_MIN = 65;
	static int LIVING_AGE_MAX = 100;
	
	// Instance variables (usually private)
	String gender;
	String height;
	String weight;
	String eyeColor;
	private String dharma; //cannot be accessed
	public int age;
	
	HumanPlus () {
		System.out.println("The door to the demon world has been opened without properties.\n"
				+ "You have been warned.");
		this.dharma = "O Indra, lead us on the path of Rta, on the right path over all evils...";
	}
	
	HumanPlus(String gender, String height, String weight,
			String eyeColor) {
		System.out.println("The door to the demon world has been opened."
				+ "\nIt emerges...it approaches!\n"
				+ "Is it human? We can never know, but it is!");
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	public String getStageOfLife() {
		if (age < TEENAGER_AGE_MIN) {
			return "Child";
		} else if (age <= TEENAGER_AGE_MAX) {
			return "Teenager";
		} else if (age < SENIOR_AGE_MIN) {
			return "Adult";
		} else if (age >= SENIOR_AGE_MIN) {
			return "Senior";
		} else if (age > LIVING_AGE_MAX) {
			return "Ready for harvesting";
		} else {
			return "Error";
		}
	}
	
	String getInfo() {
		return "Gender: " + gender + ", Height: " + height +
				", Eye Color: " + eyeColor + ", Weight: " + weight + "\n";
	}
	
	/* "C-like" version
	void setProperties(String _gender, String _height, String _weight,
			String _eyeColor) {
		gender = _gender;
		height = _height;
		weight = _weight;
		eyeColor = _eyeColor;
	}
	*/
	
	/* deprecated by the new constructor
	void setProperties(String gender, String height, String weight,
			String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	*/
}
