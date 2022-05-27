package com.abstraction;

public class Runner {

	public static void main(String[] args) {
		Pasta pasta = new Pasta();
		Pizza pizza = new Pizza();
		pasta.healthy();
		System.out.println(pizza.toString());
		
		
	}

}
