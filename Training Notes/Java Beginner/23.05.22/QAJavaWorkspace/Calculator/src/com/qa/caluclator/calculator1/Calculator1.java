package com.qa.caluclator.calculator1;

public class Calculator1 {
	
	//Attributes
	private int num1;
	private int num2;
	
	//Default Constructor
	public Calculator1() {
		
	}
	
	//Constructor
	public Calculator1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Getters and Setters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	//Methods	
//	@Override
//	public String toString() {
//		int num3 = num1 + num2;
//		return "The result of " + num1 + " + " + num2 + " = " + num3;
//	}
	
	public int total() {
		return num1 + num2;
		
	}
	
}
