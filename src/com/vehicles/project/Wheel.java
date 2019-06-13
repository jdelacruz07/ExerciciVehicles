package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;

	}

	public void makeWheel(String brandBackWheel, double diameterBackWheel, String brandBackWheelRight,
			double diameterBackWheelRight, String brandFrontWheel, double diameterFrontWheel,
			String brandFrontWheelRight, double diameterFrontWheelRight, String plate, String brand, String color)
			throws Exception {

		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();
		Wheel wheelBack = new Wheel(brandBackWheel, diameterBackWheel);
		backWheelss.add(wheelBack);
		Wheel wheelBackRight = new Wheel(brandBackWheelRight, diameterBackWheelRight);
		backWheelss.add(wheelBackRight);
		Wheel wheelFront = new Wheel(brandFrontWheel, diameterFrontWheel);
		frontWheelss.add(wheelFront);
		Wheel wheelFrontRight = new Wheel(brandFrontWheelRight, diameterFrontWheelRight);
		frontWheelss.add(wheelFrontRight);

		Car car = new Car();
		car.addWheels(frontWheelss, backWheelss);
	}
	
	public  boolean verifyDiameter (double diameter) {
		boolean isCorrect = false;
		if (diameter <= .4 || diameter >= 4) {
			isCorrect = true;
		} else {
			isCorrect = false;
		}
		return isCorrect;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		return true;
	}

}
