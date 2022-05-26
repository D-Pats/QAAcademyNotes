package com.encapsulation;

public class EncapExample {
	// 5 attributes, 3 constructors, getters and setters for all of them (write out
	// at least 2 of them without generating)
	// We will use a ------ class, and a runner class where we call stuff from the
	// ---- class

	// Attributes
	private String fName;
	private String lName;
	private int age;
	private char gender;
	private int dobYear;

	// Default Constructor
	public EncapExample() {

	}

	// Everything Constructor
	public EncapExample(String fName, String lName, int age, char gender, int dobYear) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.dobYear = dobYear;
	}

	// Name and Age Constructor
	public EncapExample(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	// Getters and Setters
	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getDobYear() {
		return dobYear;
	}

	public void setDobYear(int dobYear) {
		this.dobYear = dobYear;
	}

	// Methods
	@Override
	public String toString() {
		return "EncapExample [fName=" + fName + ", lName=" + lName + ", age=" + age + ", gender=" + gender
				+ ", dobYear=" + dobYear + "]";
	}

}
