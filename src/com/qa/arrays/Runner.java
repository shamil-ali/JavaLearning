package com.qa.arrays;

public class Runner {
	
	public static void main(String[] args) {
		
		// 3 ways to make a basic array
		int[] numArray;
		int[] anotherNumArray = {10, 23, 45, 76, 87};
		int[] finalArray = new int[5]; //This array has 5 index positions: 0-4.
		
		// Making a multi-dimensional array
		int[][] mDArray;
		int[][] anotherMDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// how to assign values in an array
//		finalArray[0] = 10;
//		finalArray[1] = 15;
//		finalArray[2] = 20;
//		finalArray[3] = 25;
//		finalArray[4] = 30;
			
//		for(int i = 0; i < finalArray.length; i++ ) {
//			finalArray[i] = 10;
//		}
		
//		for(int i = 0; i < finalArray.length; i++ ) {
//			System.out.println(finalArray[i]);
//		}
		
//		for (int x :  finalArray) {
//			System.out.println(x);
//		}
		
		for (int i = 0; i < anotherMDArray.length; i++) {
			for (int j = 0; j < anotherMDArray[i].length; j++) {
				System.out.println(anotherMDArray[i][j]);
			}
			System.out.println();
		}
		
	}

}
