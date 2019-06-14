package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
import com.sun.xml.internal.fastinfoset.util.CharArrayString;
import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la matricula del cotxe ");
		String plate = sc.nextLine();

		Car car = new Car();

		boolean plateIsCorrect = car.verifyPlate(plate);
		while (!plateIsCorrect) {
			System.out.println("Matricula Incorrecta ");
			System.out.println("Dame la matricula del cotxe ");
			plate = sc.nextLine();
			plateIsCorrect = car.verifyPlate(plate);
		}

		ingresaDatos(plate);

	}

	public static void ingresaDatos(String plate) throws Exception {
		Scanner sc = new Scanner(System.in);
		Wheel wheel = new Wheel(null, 0);

		System.out.print("Dame la marca del cotxe ");
		String brand = sc.nextLine();

		System.out.print("Dame el color del cotxe");
		String color = sc.nextLine();

		Car car = new Car(plate, brand, color);

		boolean isTrasera = false;
		System.out.print("Dame la marca de la rueda trasera izquierda");
		String brandBackWheel = sc.next();
		isTrasera = true;
		System.out.print("Dame el diametro de la rueda trasera izquierda ");
		double diameterBackWheel = sc.nextDouble();

		while (wheel.verifyDiameter(diameterBackWheel)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}

		System.out.print("Dame la marca de la ruedas trasera derecha");
		String brandBackWheelRight = sc.next();
		isTrasera = true;
		System.out.print("Dame el diametro de la rueda trasera derecha ");
		double diameterBackWheelRight = sc.nextDouble();
		while (wheel.verifyDiameter(diameterBackWheelRight)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda trasera derecha");
			diameterBackWheelRight = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda delantera izquierda ");
		String brandFrontWheel = sc.next();
		isTrasera = false;
		System.out.print("Dame el diametro de la rueda delantera izquierda ");
		double diameterFrontWheel = sc.nextDouble();
		while (wheel.verifyDiameter(diameterFrontWheel)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda delantera izquierda ");
			diameterFrontWheel = sc.nextDouble();
		}

		System.out.print("Dame la marca de la rueda delantera derecha ");
		String brandFrontWheelRight = sc.next();
		isTrasera = false;
		System.out.print("Dame el diametro de la rueda delantera derecha ");
		double diameterFrontWheelRight = sc.nextDouble();
		while (wheel.verifyDiameter(diameterFrontWheelRight)) {
			System.out.print("Diametro superior a .4 e inferior a 4 para la rueda delantera derecha ");
			diameterFrontWheelRight = sc.nextDouble();
		}

		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();

		Wheel wheelBack = new Wheel(brandBackWheel, diameterBackWheel);
		backWheelss.add(wheelBack);
		Wheel wheelFront = new Wheel(brandFrontWheel, diameterFrontWheel);
		frontWheelss.add(wheelFront);
		Wheel wheelBackRight = new Wheel(brandBackWheelRight, diameterBackWheelRight);
		backWheelss.add(wheelBackRight);
		Wheel wheelFrontRight = new Wheel(brandFrontWheelRight, diameterFrontWheelRight);
		frontWheelss.add(wheelFrontRight);

		car.addWheels(frontWheelss, backWheelss);
		System.out.println(backWheelss.size());
		System.out.println(frontWheelss.size());

	}

}
