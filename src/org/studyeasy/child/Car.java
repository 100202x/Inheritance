package org.studyeasy.child;

import org.studyeasy.parent.vehicle.Vehicle;

public class Car extends Vehicle {
	private String airConditioner;
	
	public Car(String airConditioner){
		super();
		this.airConditioner = airConditioner;
	}
	
	

	public Car(String doors, String wheels, String tyres, String engine,
			String lights,String airConditioner) {
		super(doors, wheels, tyres, engine, lights);
		this.airConditioner = airConditioner;
		// TODO Auto-generated constructor stub
	}



	public String getAirConditioner() {
		return airConditioner;
	}



	@Override
	public String toString() {
		return "Car [getAirConditioner()=" + getAirConditioner()
				+ ", getDoors()=" + getDoors() + ", getWheels()=" + getWheels()
				+ ", getTyres()=" + getTyres() + ", getEngine()=" + getEngine()
				+ ", getLights()=" + getLights() + "]";
	}
	
	@Override
	public String run(){
		return "Car is running";
	}
}
