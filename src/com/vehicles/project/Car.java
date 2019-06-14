package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public Car() {
		super(null, null, null);
	}

	public boolean verifyPlate(String plate) {

		String plateSense = plate.replaceAll(" ", "");
		int countchars = plateSense.length();
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
			// ingresaDatos(plate);
			plateIsCorrect = true;
		} else {
			plateIsCorrect = false;
		}

		return plateIsCorrect;
	}

	public void makeWheel(String brandBackWheel, double diameterBackWheel, String brandBackWheelRight,
			double diameterBackWheelRight, String brandFrontWheel, double diameterFrontWheel,
			String brandFrontWheelRight, double diameterFrontWheelRight, String plate, String brand, String color)
			throws Exception {

		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();
		Wheel wheelBack = new Wheel(brandBackWheel, diameterBackWheel);
		backWheelss.add(wheelBack);
		Wheel wheelBackRight = new Wheel(brandBackWheelRight, diameterBackWheelRight);
		backWheelss.add(wheelBackRight);
		Wheel wheelFront = new Wheel(brandFrontWheel, diameterFrontWheel);
		frontWheelss.add(wheelFront);
		Wheel wheelFrontRight = new Wheel(brandFrontWheelRight, diameterFrontWheelRight);
		frontWheelss.add(wheelFrontRight);

		
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

}
