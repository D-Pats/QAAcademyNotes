package com.liskovsubstitution;

public class Runner {

	public static void main(String[] args) {
		Studio studio = new Studio(100);
		System.out.println(studio.getNumberOfBedrooms());
		Penthouse penthouse = new Penthouse(200,4);
		System.out.println(penthouse.getNumberOfBedrooms());
		BedroomAdder addroom = new BedroomAdder();
		addroom.addBedroom(penthouse);
		System.out.println(penthouse.getNumberOfBedrooms());
	}

}