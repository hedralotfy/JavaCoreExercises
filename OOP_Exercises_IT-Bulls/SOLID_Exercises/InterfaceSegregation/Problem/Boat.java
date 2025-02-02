package com.innovator.learnit.OOP.i_in_solid.problem;

public class Boat implements Vehicle{

	/*
	 * Boat should invoke all methods of the interface
	 * as the classes that implement the interface Vehicle
	 * should inherit all its methods, despite Boat
	 * doesn't fly.
	 */
	@Override
	public void drive() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void sail() {
		System.out.println("Boat sails");
	}

}
