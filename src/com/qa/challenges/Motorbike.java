package com.qa.challenges;

public class Motorbike extends Vehicle{
	
	private String make;
	private String model;
	private int engineCC;
	private String bodyType;
	
	
	public Motorbike(String registration, int age, int numOfWheels, String colour, String make, String model, int engineCC, String bodyType) {
		
		this.setRegistration(registration);
		this.setAge(age);
		this.setNumOfWheels(numOfWheels);
		this.setColour(colour);
		
		this.make = make;
		this.model = model;
		this.engineCC = engineCC;
		this.bodyType = bodyType;
	}


	@Override
	public String toString() {
		return "Motorbike [registration = " + this.getRegistration() +  ", age = " + this.getAge() +  ", Num of Wheels =  " + this.getNumOfWheels() + 
				", colour = " + this.getColour() + "make = " + make + ", model = " + model + ", engineCC = " + engineCC + ", bodyType = " + bodyType
				+ "]";
	}
	
	
}
