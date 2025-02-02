package com.innovator.learnit.OOP.l_in_solid.problem;

public class Sparrow implements Bird {
	
	@Override
	public void fly() {
		System.out.println("Sparrow can fly.");
	}
	
	@Override
	public void eat() {
		System.out.println("Sparrow does eat.");
	}

}