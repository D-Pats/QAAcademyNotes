package com.interfacesegretation;

public class Runner {

	public static void main(String[] args) {
		Falcon atlanta = new Falcon(0);
		System.out.println(atlanta.getNumberOfEggs());
		atlanta.layEggs();
		System.out.println(atlanta.getNumberOfEggs());
	}

}
