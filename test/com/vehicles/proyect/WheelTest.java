package com.vehicles.proyect;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vehicles.project.Bike;
import com.vehicles.project.Wheel;

public class WheelTest {

	@Test 
	public void verifyDiameterTest() throws Exception {
		Wheel wheel = new Wheel();
		boolean isTrue = wheel.verifyDiameter(.6);
		assertEquals(true, isTrue);
	}

}
