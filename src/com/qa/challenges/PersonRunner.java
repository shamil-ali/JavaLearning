package com.qa.challenges;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
	public static void main(String[] args) {
		
		Person shamil = new Person("Shamil", "Ali", 23, "Software Engineer");
		Person anoush = new Person("Anoush", "Lowton", 28, "QA Trainer");
		Person john = new Person("John", "Smith", 99, "Pensioner");
		
		PersonList pl = new PersonList();
		pl.addPerson(shamil);
		pl.addPerson(anoush);
		pl.addPerson(john);
		
		pl.searchPersonName("Shamil", "Ali");
		System.out.println();
		pl.printPeopleList();
	}
}
