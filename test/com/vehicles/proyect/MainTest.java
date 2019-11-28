package com.vehicles.proyect;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vehicles.project.Bike;
import com.vehicles.project.Main;

public class MainTest {

	@Test
	public void plateTest() {
		Boolean isCorrect = Main.verifyPlate("0505hmc");
		assertEquals(true, isCorrect);
	}
	
	@Test 
	public void askInformationTest() {
		String wordOne = "Yo";
		String wordTwo = Main.askInformationString("Dime la palabra de prueba");
		assertEquals(wordOne, wordTwo);
	}

	@Test 
	public void verifyDiameterTest() {
		Bike bike = new Bike();
		boolean isTrue = bike.verifyDiameter(.5);
		assertEquals(true, isTrue);
	}

}
