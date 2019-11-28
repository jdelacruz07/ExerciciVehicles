package com.vehicles.proyect;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vehicles.project.Bike;

public class BikeTest {

	@Test 
	public void verifyDiameterTest() {
		Bike bike = new Bike();
		boolean isTrue = bike.verifyDiameter(.5);
		assertEquals(true, isTrue);
	}

}
