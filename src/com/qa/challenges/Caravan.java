package com.qa.challenges;

public class Caravan extends Vehicle {
	
	private String make;
	private String model;
	private int berth;
	private int length;
	
	public Caravan(String registration, int age, int numOfWheels, String colour, String make, String model, int berth, int length) {
		
		this.setRegistration(registration);
		this.setAge(age);
		this.setNumOfWheels(numOfWheels);
		this.setColour(colour);
		
		this.make = make;
		this.model = model;
		this.berth = berth;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Caravan [registration = " + this.getRegistration() + ", age = " + this.getAge() + ", Num of Wheels = " + this.getNumOfWheels() + 
				", colour = " + this.getColour() +  "make = " + make + ", model = " + model + ", berth = " + berth + ", length = " + length + "]";
	}
	
	

}
