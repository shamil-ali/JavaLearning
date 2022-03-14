package com.qa.challenges;

public class Vehicle {

	private String registration;
	private int age;
	private int numOfWheels;
	private String colour;
	
	public Vehicle() {}

	public Vehicle(String registration, int age, int numOfWheels, String colour) {
		this.registration = registration;
		this.age = age;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
