package stringmanip;

import stringmanip.*;

public class Runner {

	public static void main(String[] args) {
		String today = "today it is sunny";
		String yesterday = "yesterday it was raining";

//		Exercise 1 Part 1	
		String todayYesterday = today.toUpperCase() + ", " + yesterday.toUpperCase();
//		System.out.println(todayYesterday);
////		Exercise 2 Part 2
//		System.out.println(todayYesterday.substring(0, 12) + todayYesterday.substring(36, 43));
//
////		Exercise 2 Part 1
//		int j = 0;
//		for (int i = 0; i < todayYesterday.length(); i++) {
//			if (todayYesterday.substring(i, i + 1).equals(" ")) {
//				j++;
//			}
//		}
//		System.out.println(j + 1);
//
////		Exercise 2 Part 2
//		int k = 0;
//		int l = 0;
//		for (int i = 0; i < todayYesterday.length(); i++) {
//			if (todayYesterday.substring(i, i + 1).equals(" ")) {
//				System.out.println(todayYesterday.substring(k, i));
//				k = i + 1;
//				l++;
//			}
//			
//		}
//		int m = todayYesterday.length() - l;
//		System.out.println(todayYesterday.substring(m,todayYesterday.length()));
		
//	Exercise 2 part 2 Jordan's
//		String word = "";
//		for(int i = 0; i < todayYesterday.length(); i++) {
//			if(todayYesterday.substring(i, i + 1).equals(" ")){
//				System.out.println(word);
//				word = "";
//			} else {
//				word += todayYesterday.substring(i,i + 1);
//			}
//		} System.out.println(word);

////	Exercise 2 Part 3
//		int a = 0;
//		int b = 0;
//		int c = todayYesterday.length();
//		for (int i = c; i >= 0; i--) {
//			if (todayYesterday.substring(i - 1, i).equals(" ")) {
//				System.out.println("b 1: " + b);
//				System.out.println(i);
//				System.out.println(todayYesterday.substring(i, a));
//				b = i;
//				
//			} else {
//				a = b-1;
//			}
//
//		}
//		int m = c - a;
//		System.out.println(todayYesterday.substring(m,c));

	}

}
