package com.qa.oop.inheritance;

public class Cat extends Animal {
	
	private String breed;
	private String gender;
	
	public Cat(String name, int age, int numOfLegs, String colour, String breed, String gender) {
		
		this.setName(name);
		this.setAge(age);
		this.setNumOfLegs(numOfLegs);
		this.setColour(colour);
	
		this.breed = breed;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Cat [name = " + this.getName() + ", age = " + this.getAge() + ", numOfLegs = " + this.getNumOfLegs() + ", colour = " + this.getColour()
		+ ", breed = " + breed + ", gender = " + gender + "]";
	}
	
	@Override
	public void makeNoise() {
		System.out.println("meow!");
	}
}
