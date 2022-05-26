package com.constructors;

public class Runner {

	public static void main(String[] args) {
		PracticeConstructor devin1 = new PracticeConstructor();
		System.out.println(devin1);
		PracticeConstructor devin2 = new PracticeConstructor("Devin", "Patel", 24, 'M');
		System.out.println(devin2);
		PracticeConstructor devin3 = new PracticeConstructor("Devin", "Patel");
		System.out.println(devin3);
		PracticeConstructor devin4 = new PracticeConstructor(24, 'M');
		System.out.println(devin4);
		PracticeConstructor devin5 = new PracticeConstructor("Devin", "Patel", 24, 'M');
		System.out.println(devin5);
	}

}
