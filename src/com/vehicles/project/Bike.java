package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
			addTwoWheels(frontWheels);
			addTwoWheels(backWheels);
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

	public void addOneWheels(Wheel wheelMoto) throws Exception {

//		if (wheel.size() != 1)
//			throw new Exception();

//		Wheel wheel = new Wheel(wheelMoto);
//		Wheel backWheel = wheels.get(1);

		this.wheels.add(wheelMoto);
//		this.wheels.add(backWheel);
	}
}
