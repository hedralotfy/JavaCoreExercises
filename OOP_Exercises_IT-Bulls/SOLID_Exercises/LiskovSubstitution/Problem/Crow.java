package com.innovator.learnit.OOP.l_in_solid.problem;

public class Crow implements Bird {
	
	@Override
	public void fly() {
		System.out.println("Crow can fly.");
	}
	
	@Override
	public void eat() {
		System.out.println("Crow does eat.");
	}

}
