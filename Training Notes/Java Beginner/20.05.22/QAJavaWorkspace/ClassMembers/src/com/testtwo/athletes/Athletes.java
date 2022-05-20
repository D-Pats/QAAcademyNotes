package com.testtwo.athletes;

public class Athletes {
	
	//Attributes
	private String name;
	private String team;
	private int age;
		
	//Default Constructor
	public Athletes() {
		
	}
	
	//Constructor
	public Athletes(String name, String team, int age) {
		this.name = name;
		this.team = team;
		this.age = age;
	}
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	
	//Methods
	public String toString() {
		return "Name: " + name + "\nTeam: " + team + "\nAge: " + age;
	}
	
}
