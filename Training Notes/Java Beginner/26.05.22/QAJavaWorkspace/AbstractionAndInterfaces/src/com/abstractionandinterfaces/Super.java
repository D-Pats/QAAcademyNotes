package com.abstractionandinterfaces;

public abstract class Super implements InterfaceOne, InterfaceTwo, InterfaceThree {

	private String name;
	private int age;

	public Super() {

	}

	public Super(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Super [name=" + name + ", age=" + age + "]";
	}

	public String oldMan() {
		if (age > 30) {
			return "old man";
		} else {
			return "Not old yet";
		}
	}

	public String coolName() {
		if ((name.toLowerCase()).startsWith("d")) {
			return "Cool name";
		} else {
			return "yeah whatever mate";
		}
	}
	
	public void worksWithoutThisOne() {
		System.out.println("should work without being called by child");
	}
}
