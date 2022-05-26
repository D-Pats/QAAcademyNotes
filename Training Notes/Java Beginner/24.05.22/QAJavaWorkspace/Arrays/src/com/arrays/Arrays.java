package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] testArray1 = {0,1,2,3,4,5,6,7,8,9};
		int[] testArray2 = new int[10];
		
//		for(int i : testArray1) {
//			System.out.println(i);
//		}

//		for(int i = 0; i < 10; i++) {
//			testArray2[i] = i;
//			System.out.println(testArray2[i]);
//		}
//		
		for(int i = 0; i < testArray2.length; i++) {
			testArray2[i] = i;
			System.out.println(testArray2[i] * 10);
		}
	}

}
