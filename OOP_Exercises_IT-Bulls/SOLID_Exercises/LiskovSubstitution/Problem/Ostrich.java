package com.innovator.learnit.OOP.l_in_solid.problem;

public class Ostrich implements Bird {
	
	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void eat() {
		System.out.println("Sparrow does eat.");
	}

}