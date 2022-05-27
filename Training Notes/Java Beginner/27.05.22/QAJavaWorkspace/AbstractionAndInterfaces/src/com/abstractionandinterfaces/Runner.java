package com.abstractionandinterfaces;

public class Runner {

	public static void main(String[] args) {
		Child test1 = new Child("Devin", 24);
		System.out.println(test1);
		System.out.println(test1.oldMan());
		Child test2 = new Child("Devin", 24);
		System.out.println(((Super)test2).oldMan());
		
	}

}