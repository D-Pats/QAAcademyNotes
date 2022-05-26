package com.inheritance;

public class Acoustic extends Guitar {

	// Attributes
	private boolean needAmp = false;

	// Default Constructor
	public Acoustic() {
		super();
	}

	// Everything Constructor
	public Acoustic(int numStrings, String material, boolean needAmp) {
		super(numStrings, material);
		this.needAmp = needAmp;
	}

	// Getters and Setters
	public boolean getNeedAmp() {
		return needAmp;
	}

	public void setNeedAmp(boolean needAmp) {
		this.needAmp = needAmp;
	}

	// Methods
	@Override
	public String printNumStrings() {
		return "Acoustic guitar strings: only really 6 or 12";
	}

	@Override
	public String printMaterial() {
		return "Hopefully just some type of wood";
	}

	@Override
	public String toString() {
		return "Acoustic\nNumber of Strings: " + printNumStrings() + "\nMaterial: " + printMaterial() + "\nNeeds Amp: " + needAmp;
	}

}
