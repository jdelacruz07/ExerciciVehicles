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
		
		System.out.println("1) Vols crear un cotxe ");
		System.out.println("2) Vols crear una moto ");
		seleccion = sc.nextInt();
		while (seleccion !=1 && seleccion != 2 ) {
			System.out.println("1) Vols crear un cotxe ");
			System.out.println("2) Vols crear una Moto ");
			seleccion = sc.nextInt();
		}
				
		System.out.print("Dame la matricula del vehicle ");	
		String plateCar = sc.next();
		
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
		static List <Wheel> backWheelss = new ArrayList<>();
		static List <Wheel> frontWheelss = new ArrayList<>();
		
		public static void ingresaDatos(String plateCar) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la marca del vehicle ");	
		String brandCar = sc.nextLine();
		
		System.out.print("Dame el color del vehicle ");	
		String colorCar = sc.nextLine();
		
		if (seleccion ==1) {
			wheelInformation();
		} else {
			wheelInformationMoto();
		}
		
		
		if (seleccion == 1) {
			Car carone = new Car(plateCar, brandCar, colorCar);
			carone.addWheels(frontWheelss, backWheelss);
		}	else {
			Bike bike = new Bike(plateCar, brandCar, colorCar);
			bike.addWheels(frontWheelss, backWheelss, seleccion);
		}

//		System.out.println(backWheelss.size());
//		System.out.println(frontWheelss.size());
		
		
	}

//Inicia tercer metodo obtiene la informacion de las llantas, las crea y las agrega a una lista
		public static void wheelInformation() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Dame la marca de la rueda trasera izquierda");
			String brandBackWheel = sc.next();
			System.out.print("Dame el diametro de la rueda trasera izquierda ");
			double diameterBackWheel = sc.nextDouble();
			while (diameterBackWheel <= .4 || diameterBackWheel >= 4) {
				System.out.print("Dame la marca de la rueda trasera izquierda");
				brandBackWheel = sc.next();
				System.out.print("Dame el diametro de la rueda trasera izquierda ");
				diameterBackWheel = sc.nextDouble();
			}
							
			System.out.print("Dame la marca de la ruedas trasera derecha");
			String brandBackWheelRight = sc.next();
			System.out.print("Dame el diametro de la rueda trasera derecha ");
			double diameterBackWheelRight = sc.nextDouble();
			while (diameterBackWheelRight <= .4 || diameterBackWheelRight >= 4) {
				System.out.print("Dame la marca de la ruedas trasera derecha");
				brandBackWheelRight = sc.next();
				System.out.print("Dame el diametro de la rueda trasera derecha ");
				diameterBackWheelRight = sc.nextDouble();
			}
			
			System.out.print("Dame la marca de la rueda delantera izquierda ");	
			String brandFrontWheel = sc.next();
			System.out.print("Dame el diametro de la rueda delantera izquierda ");
			double diameterFrontWheel = sc.nextDouble();
			while (diameterFrontWheel <= .4 || diameterFrontWheel >= 4) {
				System.out.print("Dame la marca de la rueda delantera izquierda ");	
				brandFrontWheel = sc.next();
				System.out.print("Dame el diametro de la rueda delantera izquierda ");
				diameterFrontWheel = sc.nextDouble();
			}
			
			System.out.print("Dame la marca de la rueda delantera derecha ");	
			String brandFrontWheelRight = sc.next();
			System.out.print("Dame el diametro de la rueda delantera derecha ");
			double diameterFrontWheelRight = sc.nextDouble();
			while (diameterFrontWheelRight <= .4 || diameterFrontWheelRight >= 4) {
				System.out.print("Dame la marca de la rueda delantera derecha ");	
				brandFrontWheelRight = sc.next();
				System.out.print("Dame el diametro de la rueda delantera derecha ");
				diameterFrontWheelRight = sc.nextDouble();
			}
			
			Wheel backWheel = new Wheel(brandBackWheel, diameterBackWheel);
			Wheel backWheelRight = new Wheel(brandBackWheelRight, diameterBackWheelRight);

			Wheel frontwheel = new Wheel(brandFrontWheel, diameterFrontWheel);
			Wheel frontwheelRight = new Wheel(brandFrontWheelRight, diameterFrontWheelRight);
			

			backWheelss.add(backWheel);
			backWheelss.add(backWheelRight);
			frontWheelss.add(frontwheel);
			frontWheelss.add(frontwheelRight);

		}
		public static void wheelInformationMoto() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Dame la marca de la rueda trasera ");
			String brandBackWheel = sc.next();
			System.out.print("Dame el diametro de la rueda trasera ");
			double diameterBackWheel = sc.nextDouble();
			while (diameterBackWheel <= .4 || diameterBackWheel >= 4) {
				System.out.print("Dame el diametro de la rueda trasera  ");
				diameterBackWheel = sc.nextDouble();
			}
			
			System.out.print("Dame la marca de la rueda delantera ");	
			String brandFrontWheel = sc.next();
			System.out.print("Dame el diametro de la rueda delantera ");
			double diameterFrontWheel = sc.nextDouble();
			while (diameterFrontWheel <= .4 || diameterFrontWheel >= 4) {
				System.out.print("Dame el diametro de la rueda delantera ");
				diameterFrontWheel = sc.nextDouble();
			}
			
			Wheel backWheel = new Wheel(brandBackWheel, diameterBackWheel);
			
			Wheel frontwheel = new Wheel(brandFrontWheel, diameterFrontWheel);
			
			
			backWheelss.add(backWheel);
			frontWheelss.add(frontwheel);
			
		}
			
		
		
	

}
