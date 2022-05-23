package com.qa.caluclator.calculatorRevisited;

public class CalculatorRevisited {

	//Attributes
	double num1;
	double num2;
	
	//Constructor
	public CalculatorRevisited(double num1, double num2) {
		this.num1 = num1;
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
	
	public void divideNumbers() {
		double num3 = num1/num2;
		if(num1 < num2) {
			System.out.println(num3);
		}
		else {
			System.out.println("This division cannot be performed");
		}
	}
		
}
