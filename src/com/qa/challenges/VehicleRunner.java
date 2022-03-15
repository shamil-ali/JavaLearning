package com.qa.challenges;

public class VehicleRunner {
	
	public static void main(String[] args) {
		
		Car mclaren = new Car("SSY333D", 1, 4, "Orange", "McLaren", "P1", "SemiAutomatic", 2);
		Car audi = new Car("AL18YED", 3, 4, "Black", "Audi", "A3", "SemiAutomatic", 5);
		Car vw = new Car("X22HUS", 9, 4, "Black", "VW", "Scirocco", "Manual", 4);
		
//		System.out.println(mclaren);
//		System.out.println(audi);
//		System.out.println(vw);
		
		Motorbike honda = new Motorbike("ABC123", 2, 2, "Red", "Honda", "RC213V-S", 1000, "Super Sports");
		Motorbike bmw = new Motorbike("XYZ987", 1, 2, "Blue", "BMW", "HP4", 1000, "Super Sports");
		Motorbike harley = new Motorbike("HD1", 2, 2, "Black", "Harley-Davidson", "Fatboy", 1800, "Custom Cruiser");
		
//		System.out.println(honda);
//		System.out.println(bmw);
//		System.out.println(harley);
		
		Caravan bailey = new Caravan("REG999", 5, 6, "Silver", "Bailey", "Alicanto", 4, 8215);
		Caravan coachman = new Caravan("123HME", 4, 4, "White", "Coachmen", "Lusso", 2, 5000);
		Caravan elddis = new Caravan("BIGMAC", 1, 8, "Green", "Elddis", "Crusader", 4, 7320);
		
//		System.out.println(bailey);
//		System.out.println(coachman);
//		System.out.println(elddis);
		
		Garage garage = new Garage();
		garage.addToGarage(mclaren);
		garage.addToGarage(audi);
		garage.addToGarage(vw);
		garage.addToGarage(honda);
		garage.addToGarage(bmw);
		garage.addToGarage(harley);
		garage.addToGarage(bailey);
		garage.addToGarage(coachman);
		garage.addToGarage(elddis);
	}
}
