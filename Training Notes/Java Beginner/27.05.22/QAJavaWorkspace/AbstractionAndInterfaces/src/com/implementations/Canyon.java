package com.implementations;

public class Canyon implements InterfaceOne, InterfaceTwo{
	public Canyon() {
	}

	@Override
	public void material() {
		System.out.println("SRAM");
		
	}

	@Override
	public void cost() {
		System.out.println("Aluminium");
	}

}
