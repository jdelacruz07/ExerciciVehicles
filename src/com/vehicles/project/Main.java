package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
import com.sun.xml.internal.fastinfoset.util.CharArrayString;
import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Main {

	// Crea el menu y valida la matricula
	static int seleccion = 0;

	static Scanner sc = new Scanner(System.in);
// Mege con remote
// Mege con remote
// Mege con remote
// Mege con remote
// Mege con remote
// Mege con remote
// Mege con remote
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Car car = new Car();
//Subiendo al git desde home
		do {
			System.out.println("1) Vols crear un cotxe ");
			System.out.println("2) Vols crear una moto ");
			seleccion = sc.nextInt();

		} while (seleccion != 1 && seleccion != 2);

		System.out.print("Dame la matricula del vehicle ");
		String plate = sc.next();
		boolean plateIsCorrect = car.verifyPlate(plate);
		while (!plateIsCorrect) {
			System.out.println("Matricula Incorrecta ");
			plate = sc.next();
			plateIsCorrect = car.verifyPlate(plate);
		}

		System.out.print("Dame la marca del vehicle ");
		String brand = sc.next();
		System.out.print("Dame el color del vehicle ");
		String color = sc.next();

		if (seleccion == 1) {
			ingresaDatos(plate, brand, color);
		} else {
			ingresaDatosMoto(plate, brand, color);
		}

	}

	public static void ingresaDatos(String plate, String brand, String color) throws Exception {
		Wheel wheel = new Wheel();
		Car car = new Car(plate, brand, color);

		List<String> brandWheelArray = new ArrayList<>();
		List<Double> diameterWheelArray = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			brandWheelArray.add(brandRueda());
			diameterWheelArray.add(diameterRueda());
		}

		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();

		for (int i = 0; i < brandWheelArray.size()/2; i++) {
			Wheel wheelBack = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			backWheelss.add(wheelBack);
		}
		for (int i = 2; i < brandWheelArray.size(); i++) {
			Wheel wheelBack = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			frontWheelss.add(wheelBack);
		}

		car.addWheels(frontWheelss, backWheelss);

	}

	public static void ingresaDatosMoto(String plate, String brand, String color) throws Exception {
		Bike bike = new Bike();

		List<String> brandWheelArray = new ArrayList<>();
		List<Double> diameterWheelArray = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			brandWheelArray.add(brandRueda());
			diameterWheelArray.add(diameterRueda());
		}
	
		for (int i = 0; i < brandWheelArray.size(); i++) {
			Wheel wheel = new Wheel(brandWheelArray.get(i), diameterWheelArray.get(i));
			bike.addOneWheels(wheel);
		}

	}

	public static String brandRueda() {

		String brandWheel = null;
		System.out.print("Dame la marca de la rueda ");
		brandWheel = sc.next();

		return brandWheel;

	}

	public static double diameterRueda() {

		double diameter = 0;
		System.out.print("Dame el diametro de la rueda ");
		diameter = sc.nextDouble();

		return diameter;

	}

}
