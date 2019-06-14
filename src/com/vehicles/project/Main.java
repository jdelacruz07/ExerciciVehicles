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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Car car = new Car();

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
		Scanner sc = new Scanner(System.in);
		Wheel wheel = new Wheel();

		Car car = new Car(plate, brand, color);

		System.out.print("Dame la marca de la rueda trasera izquierda");
		String brandBackWheel = sc.next();
		System.out.print("Dame el diametro de la rueda trasera izquierda ");
		double diameterBackWheel = sc.nextDouble();
		while (wheel.verifyDiameter(diameterBackWheel) == false) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda trasera derecha");
		String brandBackWheelRight = sc.next();
		System.out.print("Dame el diametro de la rueda trasera derecha ");
		double diameterBackWheelRight = sc.nextDouble();
		while (wheel.verifyDiameter(diameterBackWheelRight) == false) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda trasera derecha");
			diameterBackWheelRight = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda delantera izquierda ");
		String brandFrontWheel = sc.next();
		System.out.print("Dame el diametro de la rueda delantera izquierda ");
		double diameterFrontWheel = sc.nextDouble();
		while (wheel.verifyDiameter(diameterFrontWheel) == false) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda delantera izquierda ");
			diameterFrontWheel = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda delantera derecha ");
		String brandFrontWheelRight = sc.next();
		System.out.print("Dame el diametro de la rueda delantera derecha ");
		double diameterFrontWheelRight = sc.nextDouble();
		while (wheel.verifyDiameter(diameterFrontWheelRight) == false) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda delantera derecha ");
			diameterFrontWheelRight = sc.nextDouble();
		}

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

		car.addWheels(frontWheelss, backWheelss);
		System.out.println(backWheelss.size());
		System.out.println(frontWheelss.size());

	}

	public static void ingresaDatosMoto(String plate, String brand, String color) throws Exception {
		Scanner sc = new Scanner(System.in);

		Bike bike = new Bike(plate, brand, color);

		System.out.print("Dame la marca de la rueda trasera ");
		String brandBackWheel = sc.next();

		System.out.print("Dame el diametro de la rueda trasera ");
		double diameterBackWheel = sc.nextDouble();
		while (!bike.verifyDiameter(diameterBackWheel)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda trasera ");
			diameterBackWheel = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda delantera ");
		String brandFrontWheel = sc.next();

		System.out.print("Dame el diametro de la rueda delantera ");
		double diameterFrontWheel = sc.nextDouble();
		while (!bike.verifyDiameter(diameterFrontWheel)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda delantera ");
			diameterFrontWheel = sc.nextDouble();
		}

		Wheel backWheel = new Wheel(brandBackWheel, diameterBackWheel);
		Wheel frontWheel = new Wheel(brandFrontWheel, diameterFrontWheel);

		bike.addOneWheels(backWheel);
		bike.addOneWheels(frontWheel);
	}
}
