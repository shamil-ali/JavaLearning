package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises {
	
	public static void main(String[] args) {
		
		List<String> newArrayList = new ArrayList<>();
		
		newArrayList.add("Element 1");
		newArrayList.add("Element 2");
		newArrayList.add("Element 3");
		System.out.println("Normal Order:  " + newArrayList); // How to add elements
		
		Collections.sort(newArrayList); // Alphabetical order (sort)
		System.out.println("Sorted Order:  " + newArrayList);
		
		Collections.sort(newArrayList, Collections.reverseOrder()); // Reverse of the sort order
		System.out.println("Reverse Order: " + newArrayList);
	}
	
	
	

}
