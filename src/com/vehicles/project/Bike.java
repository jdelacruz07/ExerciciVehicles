package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels, int seleccion) throws Exception {
		if (seleccion == 1) {
			addTwoWheels(frontWheels);
			addTwoWheels(backWheels);
		} else {
			addOneWheels(frontWheels);
			addOneWheels(backWheels);
			
		}
	}
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		
		
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
				
		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	public void addOneWheels(List<Wheel> wheels) throws Exception {
		
		
		if (wheels.size() != 1)
			throw new Exception();
		
		Wheel wheel = wheels.get(0);
//		Wheel backWheel = wheels.get(1);
		
		
		this.wheels.add(wheel);
//		this.wheels.add(backWheel);
	}
}
