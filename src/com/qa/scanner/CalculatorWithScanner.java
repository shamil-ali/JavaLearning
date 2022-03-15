package com.qa.scanner;

import java.util.Scanner;

public class CalculatorWithScanner {
	
	public int add(int x, int y) {
//		1
		return x + y;
	}
//		2
	public int mul(int x, int y) {
		return x * y;
	}
		
	public int sub(int x, int y) {
		return x - y;
	}
//		3
//	public double div(double x, double y) {
//		return x / y;
//	}
		
	
	// Revisited	
	public Double div(double x, double y) {
		
		if (x > y) {
				
			return x / y;	
				
		}  
		
		else { 
			System.out.println("The division cannot be performed");
			return null;
		}
			
	}
	
	boolean flag = true;
	String calcMethod;
	Scanner scanner = new Scanner (System.in);
			
	public void calculatorOn() {
		while (flag) {
			System.out.println("Enter the operation type: ");
		
			calcMethod = scanner.nextLine();
			System.out.println("Enter the first value: ");
			Integer x = scanner.nextInt();
		
			System.out.println("Enter the second value: ");
			Integer y = scanner.nextInt();
			scanner.nextLine();
			
			if (calcMethod.equalsIgnoreCase("Addition")) {
				System.out.println(add(x, y));
			} 
			
			else if (calcMethod.equalsIgnoreCase("Subtraction")) {
				System.out.println(sub(x, y));
			}
			
			else if (calcMethod.equalsIgnoreCase("Multiplication")) {
				System.out.println(mul(x, y));
			}
			
			else if (calcMethod.equalsIgnoreCase("Division")) {
				System.out.println(div(x, y));
			}
			
			else {
				System.out.println("Incorrect operation type. Choose from: Addition, Subtraction, Multiplication, Division");
			}
			
			System.out.println("Do you want to continue? (y/n)");
			
			String choice = scanner.nextLine();
			
			if (choice.equalsIgnoreCase("y")) {
				continue;
			}
			
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Closing session");
				flag = false;
				continue;
			}
			
			else {
				System.out.println("Invalid Value. Closing session");
			}
		}
	}
}
