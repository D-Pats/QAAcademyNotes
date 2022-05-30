package com.openclose;

public class Greeter {
	
	//not instantiating and object, creating the object variable
	private Greeting greetType;
	
	public Greeter(Greeting greeting) {
		this.greetType = greeting;
	}
	
	public String greet() {
		return this.greetType.greet();
	}

	public Greeting getGreet() {
		return getGreet();
	}

	public void setGreet(Greeting greeting) {
		this.greetType = greeting;
	}
	
}