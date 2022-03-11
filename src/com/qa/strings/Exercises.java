package com.qa.strings;

public class Exercises {
	
	public static void main(String[] args) {
		
		// Exercise 1a
		System.out.println("Exercise 1a:");
		
		String stringOne = "yesterday it was raining";
		String stringTwo = "today it is sunny";
		
		String concat = stringTwo.concat(", " + stringOne);
		
		System.out.println(concat.toUpperCase());
		
		System.out.println();
		
		// Exercise 1b
		System.out.println("Exercise 1b:");
		
		concat = concat.toUpperCase();
		
		System.out.println(concat.substring(0, 11) + " " +  concat.substring(36, 43));
		
		System.out.println();
		
		// Exercise 2 (Method 1)
		System.out.println("Exercise 2 (Method 1): ");
		
		String givenString = "This is a given string";
		String[] words = givenString.split(" ");
		System.out.println("Number of words in given string: " + words.length);
		
		System.out.println();
		
		// Exercise 2 (Method 2)
		System.out.println("Exercise 2 (Method 2): ");
		
		System.out.println(givenString.replace(" ", "\n"));
		
		System.out.println();
		
		// Exercise 2 (Method 3)
		System.out.println("Exercise 2 (Method 3): ");
		
//		for (int i = words.length - 1; i >= 0; i--) {
//		}
//		
//		stringOne.reverse();
		
	}

}
