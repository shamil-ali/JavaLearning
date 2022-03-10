package com.qa.operators;

public class Calculator {

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
//		Revisited
		
	public Double div(double x, double y) {
		
		if (x < y) {
				
			return x / y;	
				
		}  else { 
			System.out.println("The division cannot be performed");
			return null;
		}
			
	}
}
