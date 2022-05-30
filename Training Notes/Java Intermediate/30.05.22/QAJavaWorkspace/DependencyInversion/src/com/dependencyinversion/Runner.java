package com.dependencyinversion;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Developer> devs = new ArrayList<>();
		Project newProj = new Project(devs);
		BackendDeveloper back = new BackendDeveloper();
		FrontendDeveloper front = new FrontendDeveloper();
		devs.add(back);
		devs.add(front);

		newProj.implement();
		
	}

}
