package com.blackjack;

public class BlackJ {
	
	public BlackJ(int card1, int card2) {
		int c1Diff = 21 - card1;
		int c2Diff = 21 - card2;
		
		if(c1Diff < 0 && c2Diff < 0) {
			System.out.println(0);
		} else {
			if(c1Diff >= 0 && c2Diff < 0) {
				System.out.println(card1);
			} else {
				if(c1Diff < 0 && c2Diff >= 0) {
					System.out.println(card2);
				} else {
					if(c1Diff < c2Diff) {
						System.out.println(card1);
					} else {
						System.out.println(card2);
					}
				}
			}
		}
		
	}
	
	
}
