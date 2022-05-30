package com.dependencyinversion;

public class BackendDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("C# is just Microsoft Java anyway.");
	}

}
