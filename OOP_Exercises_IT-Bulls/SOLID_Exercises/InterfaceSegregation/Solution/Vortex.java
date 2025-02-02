package com.innovator.learnit.OOP.i_in_solid.solution;

public class Vortex implements Drivable, Sailable {

	@Override
	public void sail() {
		System.out.println("Vortex sailes");
	}

	@Override
	public void drive() {
		System.out.println("Vortex drives");
	}

}
