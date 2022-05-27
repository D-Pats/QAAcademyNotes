package com.abstraction;

public class Pasta extends Food {

	@Override
	public String countryOrigin() {
		return "Italy";

	}

	@Override
	public void healthy() {
		System.out.println("Can be...");

	}

	@Override
	public void cheese() {
		System.out.println("Depends what type");

	}

}
