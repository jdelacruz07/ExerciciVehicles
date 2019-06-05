package com.vehicles.project;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la matricula del cotxe ");	
		String matriculaCotxe = sc.nextLine();
		
		System.out.print("Dame la marca del cotxe ");	
		String marcaCotxe = sc.nextLine();
		
		System.out.print("Dame el color del cotxe");	
		String colorCotxe = sc.nextLine();
		
		Car carone = new Car(matriculaCotxe, marcaCotxe, colorCotxe);
		
		System.out.print("Dame la marca de las ruedas traseras");
		String marcaRuedasTraseras = sc.next();
		System.out.print("Dame el diametro de las ruedas traseras ");
		double diametroRuedasTraseras = sc.nextDouble();
						
		System.out.print("Dame la marca de las ruedas delanteras ");	
		String marcaRuedasDelanteras = sc.next();
		System.out.print("Dame el diametro de las ruedas delanteras ");
		double diametroRuedasDelanteras = sc.nextDouble();
		
		Wheel wheelTrasera = new Wheel(marcaRuedasTraseras,diametroRuedasTraseras );
		Wheel wheelDelantera = new Wheel(marcaRuedasDelanteras,diametroRuedasDelanteras );

		
		
		
	}

}
