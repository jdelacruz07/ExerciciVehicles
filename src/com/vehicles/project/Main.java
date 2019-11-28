package com.vehicles.project;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Bike bike = new Bike();
		Car car = new Car();
		
		int selection = selectionVehicle();

		String plate = askInformationString("Dame la matricula del vehicle "); 
		plate = plateCorrect(plate);

		String brand = askInformationString("Dame la marca del vehicle"); 
		String color = askInformationString("Dame el color del vehicle"); 
		if (selection == 1) {
			car.createCar(plate, brand, color);
		} else {
			bike.createBike(plate, brand, color);
		}
		System.out.println("Informacion correcta");
	}

	private static int selectionVehicle() {
		int selection;
		do {
			System.out.println("1) Vols crear un cotxe ");
			System.out.println("2) Vols crear una moto ");
			selection = sc.nextInt();
		} while (selection != 1 && selection != 2);
		return selection;
	}
	
	private static String plateCorrect(String plate) {
		boolean plateIsCorrect = verifyPlate(plate);
		while (!plateIsCorrect) {
			System.out.println("Matricula Incorrecta ");
			plate = askInformationString("Dame una matricula correcta"); 
			plateIsCorrect = verifyPlate(plate);
		}
		return plate;
	}
	
	public static  boolean verifyPlate(String plate) {
		String plateSense = plate.replaceAll(" ", "");
		char[] verifyPlate2 = plateSense.toCharArray();
		int countDigits = 0;
		int countAlphabetic = 0;
		for (char c : verifyPlate2) {
			if (Character.isDigit(c)) {
				countDigits++;
			} else {
				countAlphabetic++;
			}
		}
		boolean plateIsCorrect = false;
		if (countDigits == 4 && (countAlphabetic == 2 || countAlphabetic == 3)) {
			plateIsCorrect = true;
		} else {
			plateIsCorrect = false;
		}
		return plateIsCorrect;
	}
	
	public static String askInformationString(String data) {
		System.out.println(data);
		return sc.next();
	} 
	
}
