package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bike extends Vehicle {
	static Scanner sc = new Scanner(System.in);
	
	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public Bike() {
		super(null, null, null);
	}

	public void createBike(String plate, String brand, String color) throws Exception {
		createWheels();
	}

	private void createWheels() throws Exception {
		List<String> brandWheelArray = new ArrayList<>();
		List<Double> diameterWheelArray = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			String brandRueda = askInformationString("Dame la marca de la rueda");
			brandWheelArray.add(brandRueda);
			double diameterRueda = askInformationDouble("Dame el diametro de la rueda");
			diameterWheelArray.add(diameterRueda);
		}
	
		for (int i = 0; i < brandWheelArray.size(); i++) {
			Wheel wheel = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			addOneWheels(wheel);
		}
	}

	public void addOneWheels(Wheel wheelMoto) throws Exception {
		this.wheels.add(wheelMoto);
	}

	public static String askInformationString(String data) {
		System.out.println(data);
		return sc.next();
	}

	public static double askInformationDouble(String data) {
		System.out.println(data);
		return sc.nextDouble();
	} 
	
}
