package com.coins;

public class Coins {

	// Attributes
	public double cost;
	public double amount;

	public Coins(double cost, double amount) {
		this.cost = cost;
		this.amount = amount;
	}

	public String Change() {
		double totalChange = amount - cost;
		double fiftyNote = 0;
		double twentyNote = 0;
		double tenNote = 0;
		double fiveNote = 0;
		double twoPoundCoin = 0;
		double onePoundCoin = 0;
		double fiftyCoin = 0;
		double twentyCoin = 0;
		double tenCoin = 0;
		double fiveCoin = 0;
		double twoCoin = 0;
		double oneCoin = 0;
		for (double i = totalChange; i >= 50; i -= 50) {
			fiftyNote++;
			totalChange -= 50;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(fiftyNote + " x £50");
		for (double i = totalChange; i >= 20; i -= 20) {
			twentyNote++;
			totalChange -= 20;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(twentyNote + " x £20");
		for (double i = totalChange; i >= 10; i -= 10) {
			tenNote++;
			totalChange -= 10;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(tenNote + " x £10");
		for (double i = totalChange; i >= 5; i -= 5) {
			fiveNote++;
			totalChange -= 5;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(fiveNote + " x £5");
		for (double i = totalChange; i >= 2; i -= 2) {
			twoPoundCoin++;
			totalChange -= 2;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(twoPoundCoin + " x £2");
		for (double i = totalChange; i >= 1; i -= 1) {
			onePoundCoin++;
			totalChange -= 1;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(onePoundCoin + " x £1");
		for (double i = totalChange; i >= .5; i -= .5) {
			fiftyCoin++;
			totalChange -= .5;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(fiftyCoin + " x 50p");
		for (double i = totalChange; i >= .2; i -= .2) {
			twentyCoin++;
			totalChange -= .2;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(twentyCoin + " x 20p");
		for (double i = totalChange; i >= .1; i -= .1) {
			tenCoin++;
			totalChange -= .1;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(tenCoin + " x 10p");
		for (double i = totalChange; i >= .05; i -= .05) {
			fiveCoin++;
			totalChange -= .05;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(fiveCoin + " x 5p");
		for (double i = totalChange; i >= 0.02; i -= 0.02) {
			twoCoin++;
			totalChange -= .02;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(twoCoin + " x 2p");
		for (double i = totalChange; i >= 0.01; i -= 0.01) {
			oneCoin++;
			totalChange -= .01;
		}
//		System.out.println("Total Change: " + totalChange);
		System.out.println(oneCoin + " x 1p");
		return "";
	}

}
