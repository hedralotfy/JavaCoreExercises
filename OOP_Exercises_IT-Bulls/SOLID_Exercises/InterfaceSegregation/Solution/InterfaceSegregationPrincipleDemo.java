package com.innovator.learnit.OOP.i_in_solid.solution;

public class InterfaceSegregationPrincipleDemo {

	public static void main(String[] args) {
		Flyable plane = new Plane();
		Drivable plane2 = new Plane();
		
		plane.fly();
		plane2.drive();
		
		Sailable vortex = new Vortex();
		if (vortex instanceof Drivable) {
			((Drivable)vortex).drive();
		}

	}

}
