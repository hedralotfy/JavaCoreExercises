package com.innovator.learnit.OOP.i_in_solid.solution;

public class Plane implements Drivable, Flyable {

	@Override
	public void drive() {
		System.out.println("Plane drives");
	}

	@Override
	public void fly() {
		System.out.println("Plane flies");
	}

}
