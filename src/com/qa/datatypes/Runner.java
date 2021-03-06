package com.qa.datatypes;

public class Runner {
	public static void main(String[] args) {
//		char dataType
		char myChar = 'a';
		char myCharTwo = 'b';
		char myCharThree = 'c';
		
//		Decimal default to double
		System.out.println(10.999);
		
//		Floats must be labelled with 'f'
		float myDecimal = 10.999f;
		
//		Objects such as String contain useful methods.
		String myString = "Hello";
		
//		Wrapper Classes - used to wrap primitives in objects, so they have object methods
		Float objectFloat = myDecimal;
		Integer objectInt = 5;
		Long objectLong = 10L;
		Double objectDouble = 10.5;
		Byte objectByte = 1;
		Short objectShort = 5;	
	}
}
