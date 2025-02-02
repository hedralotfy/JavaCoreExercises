package com.innovator.learnit.OOP.l_in_solid.problem;

public class LiskovSubstitutionDemo {

	public static void main(String[] args) {
		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
		for (Bird bird : birds) {
			bird.fly();
		}

	}

}
