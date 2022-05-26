package com.constructors;
//Create a class of your choice, Create 4 private attributes in the class, and create 5 different constructors,
//and then have a go at calling these different constructors from the main runner class (the class with the main method)
public class PracticeConstructor {
	
	//Attributes
	private String fName;
	private String lName;
	private int age;
	private char gender;
	
	//Default Constructor
	public PracticeConstructor() {
		
	}
	
	//Everything Constructor
	public PracticeConstructor(String fName, String lName, int age, char gender) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
	}
	
	//fName and lName Constructor
	public PracticeConstructor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	//age and gender Constructor
	public PracticeConstructor(int age, char gender) {
		this.age = age;
		this.gender = gender;
	}
	
	//fName and age Constructor
	public PracticeConstructor(String fName, int age) {
		this.fName = fName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PracticeConstructor [fName=" + fName + ", lName=" + lName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
