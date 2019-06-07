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
		String plateCar = sc.nextLine();
		
		String verifyPlate = plateCar.replaceAll(" ", "");
		int countchars = verifyPlate.length();
		char[] verifyPlate2 = verifyPlate.toCharArray();
		int countDigits = 0;
		int countAlphabetic = 0;
		for (char c : verifyPlate2) {
			if (Character.isDigit(c)) {
				countDigits++;
			} else {
				countAlphabetic++;
			}
		}
		if (countDigits == 4 && (countAlphabetic == 2 || countAlphabetic == 3)) {
//			System.out.println("Matricula Correcta ");
			ingresaDatos(plateCar);
		} else {
			System.out.println("Matricula Incorrecta ");	
			System.out.println("Digitos " + countDigits);
			System.out.println("Alphabetic " + countAlphabetic);
		}
		
	}
// Inicia segundo metodo		
		public static void ingresaDatos(String plateCar) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la marca del cotxe ");	
		String brandCar = sc.nextLine();
		
		System.out.print("Dame el color del cotxe");	
		String colorCar = sc.nextLine();
		
		System.out.print("Dame la marca de la rueda trasera izquierda");
		String brandBackWheel = sc.next();
		System.out.print("Dame el diametro de la rueda trasera izquierda ");
		double diameterBackWheel = sc.nextDouble();
		while (diameterBackWheel <= .4 || diameterBackWheel >= 4) {
			System.out.print("Dame el diametro de la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}
						
		System.out.print("Dame la marca de la ruedas trasera derecha");
		String brandBackWheelRight = sc.next();
		System.out.print("Dame el diametro de la rueda trasera derecha ");
		double diameterBackWheelRight = sc.nextDouble();
		while (diameterBackWheelRight <= .4 || diameterBackWheelRight >= 4) {
			System.out.print("Dame el diametro de la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}
		
		System.out.print("Dame la marca de la rueda delantera izquierda ");	
		String brandFrontWheel = sc.next();
		System.out.print("Dame el diametro de la rueda delantera izquierda ");
		double diameterFrontWheel = sc.nextDouble();
		while (diameterFrontWheel <= .4 || diameterFrontWheel >= 4) {
			System.out.print("Dame el diametro de la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}
		
		System.out.print("Dame la marca de la rueda delantera derecha ");	
		String brandFrontWheelRight = sc.next();
		System.out.print("Dame el diametro de la rueda delantera derecha ");
		double diameterFrontWheelRight = sc.nextDouble();
		while (diameterFrontWheelRight <= .4 || diameterFrontWheelRight >= 4) {
			System.out.print("Dame el diametro de la rueda trasera izquierda ");
			diameterBackWheel = sc.nextDouble();
		}

		Car carone = new Car(plateCar, brandCar, colorCar);

		Wheel backWheel = new Wheel(brandBackWheel, diameterBackWheel);
		Wheel backWheelRight = new Wheel(brandBackWheelRight, diameterBackWheelRight);

		Wheel frontwheel = new Wheel(brandFrontWheel, diameterFrontWheel);
		Wheel frontwheelRight = new Wheel(brandFrontWheelRight, diameterFrontWheelRight);
		
		
		List <Wheel> backWheelss = new ArrayList<>();
		List <Wheel> frontWheelss = new ArrayList<>();

		backWheelss.add(backWheel);
		backWheelss.add(backWheelRight);
		frontWheelss.add(frontwheel);
		frontWheelss.add(frontwheelRight);
		
//		System.out.println(backWheelss.size());
//		System.out.println(frontWheelss.size());
		
		carone.addWheels(frontWheelss, backWheelss);
		
	}

		
		
		
	

}
