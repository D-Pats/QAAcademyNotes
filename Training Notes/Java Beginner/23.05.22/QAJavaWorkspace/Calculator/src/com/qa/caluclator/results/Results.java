package com.qa.caluclator.results;

public class Results {
	
	//Attributes
	private double physics;
	private double chemistry;
	private double biology;
	private double total;
	private double percentage;
	
	//Default Constructor
	public Results() {
		
	}
	
	//Constructor
	public Results(double physics, double chemistry, double biology) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
//		this.total = total;
//		this.percentage = percentage;
	}

	
	//Getters and Setters
	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getBiology() {
		return biology;
	}

	public void setBiology(double biology) {
		this.biology = biology;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	//Methods
	public String marks() {
		return "Physics: " + physics + "\nBiology: " + biology + "\nChemistry: " + chemistry + "\nTotal: " + (physics + biology + chemistry);
	}
	
	public double percentOfTotal() {
		return ((physics + biology + chemistry) / 450) * 100;
	}
	
}
