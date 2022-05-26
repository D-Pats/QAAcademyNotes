package com.inheritance;

public class Guitar {

	// Attributes
	private int numStrings = 6;
	private String material = "wood";

	// Default Constructor
	public Guitar() {
	}

	// Everything Constructor
	public Guitar(int numStrings, String material) {
		super();
		this.numStrings = numStrings;
		this.material = material;
	}

	// Getters and Setters
	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	// Methods
	public String printMaterial() {
		return "Material type: " + material;
	}

	public String printNumStrings() {
		return "Number of strings: " + numStrings;
	}

	// Methods
	@Override
	public String toString() {
		return "numStrings= " + numStrings + "\nmaterial= " + material;
	}

}
