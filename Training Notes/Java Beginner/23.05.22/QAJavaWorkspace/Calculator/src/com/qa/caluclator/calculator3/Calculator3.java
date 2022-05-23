package com.qa.caluclator.calculator3;

public class Calculator3 {
	
	//Attributes
	private double num1;
	private double num2;
	
	//Default Constructor
	public Calculator3() {
		
	}
	
	//Constructor
	public Calculator3(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Getters and Setters
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	//Methods	
	public double addNumbers() {
		return num1 + num2;
	}
	
	public double multiplyNumbers() {
		return num1 * num2;
	}
	
	public double subtractNumbers() {
		return num1 - num2;
	}
	
	public double divideNumbers() {
		return num1 / num2;
		}
}
