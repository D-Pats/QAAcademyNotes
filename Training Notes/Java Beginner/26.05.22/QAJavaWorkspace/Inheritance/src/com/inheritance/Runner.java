package com.inheritance;

public class Runner {

	public static void main(String[] args) {

		Guitar guitar = new Guitar();
		Acoustic acoustic = new Acoustic();
		Electric electric = new Electric();
		Electric electricPickups = new Electric(2);
		System.out.println(guitar.printNumStrings());
		System.out.println(acoustic.printNumStrings());
		System.out.println(acoustic.getNeedAmp());
		System.out.println(acoustic.toString());
		System.out.println(electric.toString());
		System.out.println(electricPickups.toString());
	}

}
