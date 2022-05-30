package com.singleresponsibility;

public class Car {
	private String colour;
	private String model;
	private int mileage;
	private String serviced;
	
	// constructor
	public Car(String colour, String model, int mileage, String serviced) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.serviced = serviced;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	// getters and setters for colour, model, mileage
}