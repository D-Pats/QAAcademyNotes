package com.inheritance;

public class Electric extends Guitar {

	// Attributes
	private boolean needAmp = true;
	private int numPickups;

	// Default Constructor
	public Electric() {
		super();
	}

	// Pickup Constructor
	public Electric(int numPickups) {
		super();
		this.numPickups = numPickups;
	}
	
	// Everything Constructor
	public Electric(int numStrings, String material, boolean needAmp, int numPickups) {
		super(numStrings, material);
		this.needAmp = needAmp;
		this.numPickups = numPickups;
	}

	// Getters and Setters
	public boolean getNeedAmp() {
		return needAmp;
	}

	public void setNeedAmp(boolean needAmp) {
		this.needAmp = needAmp;
	}

	public int getNumPickups() {
		return numPickups;
	}

	public void setNumPickups(int numPickups) {
		this.numPickups = numPickups;
	}

	@Override
	public String printNumStrings() {
		return "Electric guitar strings: At least 6";
	}

	@Override
	public String printMaterial() {
		return "Hopefully just some type of wood or be crazy with metal";
	}

	@Override
	public String toString() {
		return "Electric\nNeeds Amp: " + needAmp + "\nNumber of Pickups: " + numPickups + "\nNumber of Strings: " + printNumStrings() + "\nMaterial: "
				+ printMaterial();
	}

}
