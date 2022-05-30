package com.liskovsubstitution;

public class Studio {
	private int squareFootage;
	private int numberOfBedrooms = 0;

	public Studio(int squareFootage) {
		this.squareFootage = squareFootage;
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
