package org.studyeasy.parent.vehicle;

public class Vehicle {
	
	private String doors;
	private String wheels;
	private String tyres;
	private String engine;
	private String lights;

	public Vehicle(String doors, String wheels, String tyres, String engine,
			String lights) {
		this.doors = doors;
		this.wheels = wheels;
		this.tyres = tyres;
		this.engine = engine;
		this.lights = lights;
	}

	public Vehicle() {
		doors = "Double";
		wheels = "Alloy";
		tyres = "Rubber";
		engine = "Petrol";
		lights = "Neon";
	}

	public String getDoors() {
		return doors;
	}

	public String getWheels() {
		return wheels;
	}

	public String getTyres() {
		return tyres;
	}

	public String getEngine() {
		return engine;
	}

	public String getLights() {
		return lights;
	}
	
	public String run(){
		return "Vehicle Running";
	}
	
}
