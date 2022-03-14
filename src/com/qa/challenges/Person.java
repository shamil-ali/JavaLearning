package com.qa.challenges;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String jobTitle;
	
	public Person(String firstName, String lastName, int age, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return "Person [First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Job Title: " + jobTitle + "]";
		
		
	}
}
