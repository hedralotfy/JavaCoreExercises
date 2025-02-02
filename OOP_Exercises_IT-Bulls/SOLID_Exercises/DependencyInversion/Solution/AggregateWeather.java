package com.innovator.learnit.OOP.d_in_solid.solution;

import java.util.Arrays;

public class AggregateWeather {
	
	private WeatherSource[] weatherSources;
	
	public AggregateWeather(WeatherSource[] weatherSource) {
		this.weatherSources = weatherSource;
	}
	
	public double getAverageTemperature() {
		return Arrays.stream(weatherSources)
	            .mapToDouble(WeatherSource::getTemperatureCelcius)
	            .average()
	            .getAsDouble();
	}

}
