

package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
//		1
		Calculator c = new Calculator();
		System.out.println(c.add(5, 10));
		System.out.println(c.sub(5, 10));
		System.out.println(c.mul(5, 10));
	    System.out.println(c.div(5, 10));
	    
//		2
		Results r = new Results("Shamil", 150, 145, 130);
		r.methodOne();
		r.methodTwo();
	}
}
