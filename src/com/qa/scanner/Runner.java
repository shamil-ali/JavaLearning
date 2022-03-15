package com.qa.scanner;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
				
		while (flag) {
			
			System.out.println("Enter a number: ");
			Integer numberOne = scanner.nextInt();
			
			System.out.println("Enter another number: ");
			Integer numberTwo = scanner.nextInt();
			
			System.out.print("Sum: ");
			System.out.println(numberOne + numberTwo);
			
			scanner.nextLine(); // COnsume new line left over from nextInt()
			
			System.out.println("Would you like to continue? (y/n)");
			String choice = scanner.nextLine();
			
			if (choice.equalsIgnoreCase("y")) {
				continue;
			} else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Application stopping...");
				flag = false;
				continue;
			} else {
				System.out.println("You entered an invalid value. Restarting App.");
			}
		}
		
//		System.out.println("Enter a value: !");
//		Integer numberOne = scanner.nextInt();
//		
//		scanner.nextLine(); // Consume the \n that was leftover
//		
//		System.out.println("Enter another value: ");
//		String text = scanner.nextLine();
//		
//		System.out.println("Value 1 = " + numberOne);
//		System.out.println("Value 2 = " + text );
		
//		System.out.println("Enter another number: !");
//		Integer numberTwo = scanner.nextInt();
//		
//		System.out.println(numberOne + numberTwo);
		
		scanner.close(); // This method will close the scanner, its v important to close scanner
		
	}
}
