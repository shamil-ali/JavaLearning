package com.qa.arrays;

public class Exercises {
	
	public static void main(String[] args) {
		
//		// Exercise 1
//		int [] anArray = new int {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for (int i = 0; i < anArray.length; i++) {
//			System.out.println(anArray[i]);	
//		}
		
		// Exercise 2
		int [] anotherArray = new int [10];
		
		for (int i = 0; i < anotherArray.length; i++) {
			anotherArray[i] = i + 1;
			System.out.print(" " + anotherArray[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < anotherArray.length; i++) {
			anotherArray[i] = anotherArray[i] * 10;
			System.out.print(" " + anotherArray[i]);
		}
	}
}
