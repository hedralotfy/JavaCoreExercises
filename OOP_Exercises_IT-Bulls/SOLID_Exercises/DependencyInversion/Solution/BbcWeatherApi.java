package com.innovator.learnit.OOP.d_in_solid.solution;

public class BbcWeatherApi implements WeatherSource {

	@Override
	public double getTemperatureCelcius() {
		return toCelsius(getTemperatureFahrenheit());
	}

	public double getTemperatureFahrenheit() {
		return 0.0;
	}

	public double toCelsius(double temperatureFahrenheit) {
		return (temperatureFahrenheit - 32) / 1.8f;
	}

}
