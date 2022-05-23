package com.qa.caluclator.results;

public class ResultsRevisited {
	
	public double physics;
	public double chemistry;
	public double biology;
	public double total;
	public double percentage;
	
	//Default Constructor
	public ResultsRevisited() {
		
	}
	
	//Constructor
	public ResultsRevisited(double physics, double chemistry, double biology) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + biology + chemistry;
		this.percentage = total /450 * 100;
	}
	
	public void passFail() {
		if(physics < 90 || biology < 90 || chemistry < 90 || percentage < 60) {
			System.out.println("fail");
		} else {
			System.out.println("pass");
		}
	}

}
