package com.innovator.learnit.OOP.i_in_solid.problem;

public interface Vehicle {

	/*
	 * Vehicle has the three methods which should be invoked in children classes,
	 * no matter the logic for each of them.
	 */
	void drive();
	
	void fly();
	
	void sail();
	
}
