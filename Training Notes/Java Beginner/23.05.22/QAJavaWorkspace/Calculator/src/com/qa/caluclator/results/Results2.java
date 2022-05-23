package com.qa.caluclator.results;

public class Results2 {
	
	private double physics;
	private double chemistry;
	private double biology;
	private double total;
	private double percentage;
	
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
	
}
