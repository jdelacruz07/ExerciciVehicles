package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {
	static Scanner sc = new Scanner(System.in);
	
	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public Car() {
		super(null, null, null);
	}

	public void createCar(String plate, String brand, String color) throws Exception {
	
		createWheels();
	}

	private void createWheels() throws Exception {
		List<String> brandWheelArray = new ArrayList<>();
		List<Double> diameterWheelArray = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			String brandRueda = askInformationString("Dame la marca de la rueda");
			brandWheelArray.add(brandRueda);
			double diameterRueda = askInformationDouble("Dame el diametro de la rueda");
			diameterWheelArray.add(diameterRueda);
		}
	
		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();
		for (int i = 0; i < brandWheelArray.size() / 2; i++) {
			Wheel wheelBack = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			backWheelss.add(wheelBack);
		}
	
		for (int i = 2; i < brandWheelArray.size(); i++) {
			Wheel wheelBack = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			frontWheelss.add(wheelBack);
		}
		addWheels(frontWheelss, backWheelss);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
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
