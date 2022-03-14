package com.qa.challenges;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	private List<Person> listOfPeople = new ArrayList<>();

	public PersonList () {
	}
	
	public void addPerson(Person person) {
		listOfPeople.add(person);
	}
	
	public void searchPersonName(String firstName, String lastName) {
		
		for(int i = 0; i < listOfPeople.size(); i++) {
			if(listOfPeople.get(i).getFirstName().equals(firstName) && 
				listOfPeople.get(i).getLastName().equals(lastName)) {
				System.out.println("Person Found!");
				System.out.println(listOfPeople.get(i));
				return;
			}
		}
		
		System.out.println("Person not found!");
	}
	
	public void printPeopleList () {
		for (int i = 0; i < listOfPeople.size(); i++) {
			System.out.println(listOfPeople.get(i));
		}
	}
}
