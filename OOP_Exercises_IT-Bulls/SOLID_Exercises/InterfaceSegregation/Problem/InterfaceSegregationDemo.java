package com.innovator.learnit.OOP.i_in_solid.problem;

public class InterfaceSegregationDemo {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle boat = new Boat();
		
		car.drive();
		plane.fly();
		boat.sail();

	}

}
