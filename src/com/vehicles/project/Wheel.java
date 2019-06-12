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

	public void makeWheel(String brand, double diameter, boolean isTrasera) throws Exception {
		
		List<Wheel> backWheelss = new ArrayList<>();
		List<Wheel> frontWheelss = new ArrayList<>();
		if (isTrasera) {
			Wheel wheelBack = new Wheel(brand, diameter);
			backWheelss.add(wheelBack);
		} else {
		Wheel wheelFront = new Wheel(brand, diameter);
		frontWheelss.add(wheelFront);
		}
		Car car = new Car();
		car.addWheels(frontWheelss, backWheelss);
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
