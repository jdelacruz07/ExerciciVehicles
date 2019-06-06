package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la matricula del cotxe ");	
		String plateCar = sc.nextLine();
		
		System.out.print("Dame la marca del cotxe ");	
		String brandCar = sc.nextLine();
		
		System.out.print("Dame el color del cotxe");	
		String colorCar = sc.nextLine();
		
		Car carone = new Car(plateCar, brandCar, colorCar);
		
		System.out.print("Dame la marca de las ruedas traseras");
		String brandBackWheel = sc.next();
		System.out.print("Dame el diametro de las ruedas traseras ");
		double diameterBackWheel = sc.nextDouble();
						
		System.out.print("Dame la marca de las ruedas delanteras ");	
		String brandFrontWheel = sc.next();
		System.out.print("Dame el diametro de las ruedas delanteras ");
		double diameterFrontWheel = sc.nextDouble();

		Wheel backWheel = new Wheel(brandBackWheel, diameterBackWheel);
		Wheel frontwheel = new Wheel(brandFrontWheel, diameterFrontWheel);
		
		List <Wheel> backWheels = new ArrayList<>();
		List <Wheel> frontWheels = new ArrayList<>();

		backWheels.add(backWheel);
		backWheels.add(backWheel);
		frontWheels.add(frontwheel);
		frontWheels.add(frontwheel);
		
		carone.addWheels(frontWheels, backWheels);

	}

		
		
		
	

}
