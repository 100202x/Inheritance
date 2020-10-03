package org.studyeasy.Demo;

import org.studyeasy.child.Car;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Dual");
		System.out.println(car);
		
		Car car1 = new Car("Single","Aluminum","Nazdaq","Diesel","LED","Mono");
		System.out.println(car1);
		
		System.out.println(car1.run());
	}

}
