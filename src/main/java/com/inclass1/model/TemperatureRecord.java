package com.inclass1.model;

public class TemperatureRecord {
	private final String type;
	private final double fromTemperature;
	private final double toTemperature;

	public TemperatureRecord(String type, double fromTemperature, double toTemperature) {
		this.type = type;
		this.fromTemperature = fromTemperature;
		this.toTemperature = toTemperature;
	}

	public String getType() {
		return type;
	}

	public String getFrom() {
		return fromTemperature + " " + fromUnit();
	}

	public String getTo() {
		return toTemperature + " " + toUnit();
	}

	public double getFromTemperature() {
		return fromTemperature;
	}

	public double getToTemperature() {
		return toTemperature;
	}

	private String fromUnit() {
		return switch (type) {
			case "Fahrenheit to Celsius" -> "°F";
			case "Celsius to Fahrenheit" -> "°C";
			default -> "K";
		};
	}

	private String toUnit() {
		return type.equals("Celsius to Fahrenheit") ? "°F" : "°C";
	}
}
