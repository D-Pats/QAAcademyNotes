package com.taxes;

public class Taxes {
	
	public double salary;
	public double percent;
	public double taxed;
	
	public Taxes(double salary) {
		this.salary = salary;
	}
	
	public double taxedPercent() {
		if(salary < 15000) {
			percent = 0;
		} else if(salary > 14999 && salary < 20000) {
			percent = 10;
		} else if(salary > 19999 && salary < 30000) {
			percent = 15;
		} else if(salary > 29999 &&  salary < 45000) {
			percent = 20;
		} else {
			percent = 25;
		}
		return percent;
	}
	
//	public double taxedAmount() {
//		if(salary < 15000) {
//			taxed = 0;
//		} else if(salary > 14999 && salary < 20000) {
//			taxed = salary * 0.1;
//		} else if(salary > 19999 && salary < 30000) {
//			taxed = salary * 0.15;
//		} else if(salary > 29999 &&  salary < 45000) {
//			taxed = salary * 0.2;
//		} else {
//			taxed = salary * 0.25;
//		}
//		return taxed;
//	}
	
	public double taxedAmount() {
		taxedPercent();
		if(percent == 0) {
			taxed = 0;
		} else if(percent == 10) {
			taxed = salary * 0.1;
		} else if(percent == 15) {
			taxed = salary * 0.15;
		} else if(percent == 20) {
			taxed = salary * 0.2;
		} else {
			taxed = salary * 0.25;
		}
		return taxed;
	}
}
