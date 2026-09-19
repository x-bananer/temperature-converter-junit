package com.inclass1;

public class TemperatureConverter {
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public double kelvinToCelsius(double kelvin) {
		return Math.round((kelvin - 273.15) * 100.0) / 100.0;
	}

	public boolean isExtremeTemperature(double celsius) {
		return celsius < -40.0 || celsius > 50.0;
	}
}
