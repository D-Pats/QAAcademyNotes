package com.implementations;

public class Specialized implements InterfaceTwo, InterfaceThree{
	public Specialized() {
	}

	@Override
	public void groupSet() {
		System.out.println("Shimano");
	}

	@Override
	public void material() {
		System.out.println("Aluminium");
	}

}
