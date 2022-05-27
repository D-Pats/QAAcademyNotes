package com.abstractionandinterfaces;

public class Child extends Super {
	private int age;
	
	public Child() {
		super();
	}

	public Child(String name, int age) {
		super(name, age);
		this.age = age;
	}
	
	@Override
	public String oldMan() {
		if (age < 30) {
			return "Bit young aren't ya?";
		} else {
			return "You're really old";
		}
	}

	@Override
	public String toString() {
		return "Child\nAge: " + age + "\nAre you an old man: " + oldMan();
	}



}
