package com.qa.caluclator.results;

public class Results2 {
	
	public double physics;
	public double chemistry;
	public double biology;
	public double total;
	public double percentage;
	
	//Default Constructor
	public Results2() {
		
	}
	
	//Constructor
	public Results2(double physics, double chemistry, double biology) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + biology + chemistry;
		this.percentage = total /450 * 100;
	}

	//Methods
	public String marks() {
		return "Physics: " + physics + "\nBiology: " + biology + "\nChemistry: " + chemistry + "\nTotal: " + total;
	}
	
	public double percentOfTotal() {
		return percentage;
	}
	
	public String passFail() {
		Results2.marks();
		
	}
	
}
