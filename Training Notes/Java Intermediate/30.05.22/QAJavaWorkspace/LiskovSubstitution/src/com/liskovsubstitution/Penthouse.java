package com.liskovsubstitution;

public class Penthouse {

	private int squareFootage;
	private int numberOfBedrooms;
	
	public Penthouse(int squareFootage, int numberOfBedrooms) {
		this.squareFootage = squareFootage;
		this.numberOfBedrooms = numberOfBedrooms;
	}
	
	public int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
}
