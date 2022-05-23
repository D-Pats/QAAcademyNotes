package com.uniquesum;

public class UniqueSum {

	public UniqueSum(int num1, int num2, int num3) {
	
		if(num1 != num2 && num1 != num3 && num2 != num3) {
			System.out.println(num1 + num2 + num3);
		} else if(num1 != num2 && num2 == num3) {
			System.out.println(num1);
		} else if(num1 == num2 && num1 != num3) {
			System.out.println(num3);
		} else if(num1 == num3 && num1 != num2) {
			System.out.println(num2);
		} else {
			System.out.println(0);
		}
	}
		
}
