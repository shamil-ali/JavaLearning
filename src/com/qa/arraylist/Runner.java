package com.qa.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		// Create a new arraylist
		List<String> listOfStrings = new ArrayList<>(); // Array list syntax will always look like this
		
		// Add to the array list
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		
		// Get values out of the array list
		System.out.println(listOfStrings.get(1));
		
		// Change a value at specified index in the array list
		listOfStrings.set(0, "Hi");
		System.out.println(listOfStrings.get(0));
		
		// Remove element and change length of array list based on index position
		listOfStrings.remove(1);
		System.out.println(listOfStrings);
		
		// Get the length of the array list
		System.out.println("The length is: " + listOfStrings.size());
		
		
		listOfStrings.clear();
		System.out.println(listOfStrings);
	}

}
