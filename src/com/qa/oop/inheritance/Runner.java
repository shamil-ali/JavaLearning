package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(10,4, "Brown");
		Dog lilo = new Dog("Lilo", 1, 4, " Brindle", " Cane Corso", true);
		Dog stitch = new Dog("Stitch", 1, 4, " Black", "Cane Corso", false);
		Cat mano = new Cat("Mano", 17, 4, " Tabby", " Short Hair", " Male");
		
		System.out.println(stitch);
		System.out.println(lilo);
		System.out.println(mano);
		
		// Dog is a Dog
		// Dog is an Animal
		// Dog is an Object
		
		List<Animal> listOfAnimals = new ArrayList<>();
//		listOfAnimals.add(animal);
		listOfAnimals.add(lilo);
		listOfAnimals.add(stitch);
		listOfAnimals.add(mano);
		
		
	}
}
