package com.qa.caluclator.calculator2;

public class Calculator2 {
	
	//Attributes
	private int num1;
	private int num2;
	
	//Default Constructor
	public Calculator2() {
		
	}
	
	//Constructor
	public Calculator2(int num1, int num2) {
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
	public int addNumbers() {
		return num1 + num2;
	}
	
	public int multiplyNumbers() {
		return num1 * num2;
	}
	
	public int subtractNumbers() {
		return num1 - num2;
	}
	
	public int divideNumbers() {
		return num1 / num2;
		}
}
