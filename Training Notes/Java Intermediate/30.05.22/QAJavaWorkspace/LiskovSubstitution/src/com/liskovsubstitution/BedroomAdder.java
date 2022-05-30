package com.liskovsubstitution;

public class BedroomAdder {
	public void addBedroom(Penthouse penthouse){
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
	}

}
