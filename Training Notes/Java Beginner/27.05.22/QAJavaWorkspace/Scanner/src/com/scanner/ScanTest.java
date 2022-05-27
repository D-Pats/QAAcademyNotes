package com.scanner;

import java.util.Scanner;

public class ScanTest {

	public void tryMe() {
		// Initiate Scanner
		Scanner scanTest1 = new Scanner(System.in);

		System.out.println("How many drinks have you had tday");
		int numDrinks = scanTest1.nextInt();

		// Because it's not a nextLine() we need to do a nextLine();
		scanTest1.nextLine();
		// Basically nextLine() to nextLine() is fine otherwise anything to nextLin() you need this and anything like nextInt() to nexInt() you don't need.

		System.out.println("What did you eat?");
		String foodEaten = scanTest1.nextLine();

		System.out.println("Drank " + numDrinks + " drinks, and ate " + foodEaten);
	}
}
