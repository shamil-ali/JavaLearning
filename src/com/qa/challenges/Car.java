package com.qa.challenges;

public class Car extends Vehicle{
	
	private String make;
	private String model;
	private String transmission;
	private int numOfSeats;
	
	public Car(String registration, int age, int numOfWheels, String colour, String make, String model, String transmission, int numOfSeats) {
		
		this.setRegistration(registration);
		this.setAge(age);
		this.setNumOfWheels(numOfWheels);
		this.setColour(colour);
		
		this.make = make;
		this.model = model;
		this.transmission = transmission;
		this.numOfSeats = numOfSeats;
	}

	@Override
	public String toString() {
		return "Car [registration = " + this.getRegistration() + ", age = " + this.getAge() + ", Num of Wheels = " + this.getNumOfWheels() +
				", colour = " + this.getColour() +  ", make = " + make + ", model = " + model + ", transmission = " + transmission + ", numOfSeats = " 
				+ numOfSeats + "]";
	}

}
