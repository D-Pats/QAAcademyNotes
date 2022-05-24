package com.qa.flowcharts;

public class FCIteration1 {
		public int a;

		
	public FCIteration1(int a) {
		this.a = a;
	}

	public void flowChart1() {
		
		while(this.a <= 200) {
			System.out.println(this.a);
			this.a ++;
		}
		
	}

	public void flowChart2() {
		
		while(this.a <= 200) {
			if(this.a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			} this.a ++;
		}
		
	}
	
	public void flowChart3() {
		int n = 1;
		
		for(int i = 1; i <=10; i++) {
			while(n <= 10) {
				System.out.println(i);
				n++;
				
			} n = 1;
		}
	}
	
	public void flowChart1v2() {

		for(int a = 100; a < 200; a++) {
			System.out.println(a);
		}
	}
	
	public void flowChart2v2() {
		
		for(int a = 100; a <=200; a++) {
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
		
	public void flowChart3v2() {
				
		for(int i = 1; i <=10; i++) {
			for(int n = 1; n <= 10; n++) {
				System.out.println(i);	
			}
		}
	}
	
	public void flowchart5() {
		
		for(int i = 1; i <=10; i++) {
			for(int n = 1; n <= i; n++) {
				System.out.println(i);	
			}
		}
	}
	
}
