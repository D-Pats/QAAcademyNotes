package com.openclose;

public class Runner {

	public static void main(String[] args) {
		FormalGreeting fgreet = new FormalGreeting();
		CasualGreeting cgreet = new CasualGreeting();
		Greeter casgreet = new Greeter(cgreet);
		Greeter formgreet = new Greeter(fgreet);
		
		System.out.println(casgreet.greet());
		System.out.println(formgreet.greet());
		
		
		
//		System.out.println(fgreet.greet());
//		System.out.println(cgreet.greet());

	}

}
