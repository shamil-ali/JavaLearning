package com.qa.challenges;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle{
		
		private List<Vehicle> listOfVehicles = new ArrayList<>();
		
		public void addToGarage (Vehicle v) {
			
			listOfVehicles.add(v);
	    }	
		
		public void garageBill () {
			
			listOfVehicles.stream().forEach((vehicle) -> {
				System.out.println("Vehicle Num " + vehicle);
				
				if (vehicle instanceof Car) {
					System.out.println("Bill = £29.99/day");
				}
				
				else if (vehicle instanceof Motorbike) {
					System.out.println("Bill = £19.99/day");
				}
				
				else if (vehicle instanceof Caravan) {
					System.out.println("Bill = £49.99/day");
				}
			});
		}
		
		public String removeByID (int id) {
			id--;
			listOfVehicles.remove(id);
			id++;
			return "Vehicle Num " + id + " removed";	
		}
		
		public String removeByType (String type) {
			
			if (type == "Car") {
				for (int i = 0; i < listOfVehicles.size(); i++) {
					if (listOfVehicles.get(i) instanceof Car) {
						listOfVehicles.remove(i);
					}
				}
			}
				
			if (type == "Motorbike") {
				for (int i = 0; i < listOfVehicles.size(); i++) {
					if (listOfVehicles.get(i) instanceof Motorbike) {
						listOfVehicles.remove(i);
					}
				}
			}
			
			if (type == "Caravan") {
				for (int i = 0; i < listOfVehicles.size(); i++) {
					if (listOfVehicles.get(i) instanceof Caravan) {
						listOfVehicles.remove(i);
					}
				}
			}
			return "All " + type + "s have been removed!";
		}
		
		public void emptyGarage () {
			listOfVehicles.clear();
			System.out.println("Garage is cleared and empty!");
		}
}
