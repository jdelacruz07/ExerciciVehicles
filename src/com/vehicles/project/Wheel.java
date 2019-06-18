package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		this.verifyDiameter(diameter);
		this.brand = brand;
		this.diameter = diameter;

	}

	public Wheel() {
		
	}

	public void verifyDiameter(double diameter) throws Exception {
		if (diameter <= .4 || diameter >= 4) 
			throw new Exception("Diametro incorrecto");
		

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
