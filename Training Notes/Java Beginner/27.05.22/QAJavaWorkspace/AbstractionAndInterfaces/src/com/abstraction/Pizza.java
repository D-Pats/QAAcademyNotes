package com.abstraction;

public class Pizza extends Food {

	@Override
	public String countryOrigin() {
		return "Italy";

	}

	@Override
	public void healthy() {
		System.out.println("Not very healthy");

	}

	@Override
	public void cheese() {
		System.out.println("Loads");
	}

	@Override
	public String toString() {
		return "Pizza [countryOrigin()=" + countryOrigin() + "]";
	}

}
