package com.qa.oop.inheritance;

public class Dog extends Animal{

	private String breed;
	private boolean isPanting;
	
	public Dog(String name, int age, int numOfLegs, String colour, String breed, boolean isPanting) {
		
//		super(age, numOfLegs, colour); // Using super constructor
		
		// Or instead of super constructor you can use setter/getter to inherit from parent
		this.setName(name);
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
		
		// These are properties exclusive to a Dog
		this.breed = breed;
		this.isPanting = isPanting;
	}
	
	@Override 
	public String toString() { // use getters for out of class variables
		return "Dog [name = " + this.getName() + ", age =" + this.getAge() + ", numOfLegs =" + this.getNumOfLegs() + ", colour =" + this.getColour()
		+ ", breed = " + breed + ", is panting = " + isPanting + "]";
	}
	
	@Override
	public void makeNoise() {
		System.out.println("woof!");
	}
}
