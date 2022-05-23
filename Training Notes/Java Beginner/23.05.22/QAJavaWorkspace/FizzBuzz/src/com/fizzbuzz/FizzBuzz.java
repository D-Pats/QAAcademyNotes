package com.fizzbuzz;

public class FizzBuzz {
	
	public int number;
	
	public FizzBuzz(int number) {
		this.number = number;
		if(number % 3 == 0 && number % 5 == 0) {
			System.out.println("Fizz Buzz");
			} else {
				if(number % 3 == 0) {
					System.out.println("Fizz");
				} else {
					if(number % 5 == 0) {
						System.out.println("Buzz");
					} else {
						System.out.println(number);
					}
				}
			}
	}
}
