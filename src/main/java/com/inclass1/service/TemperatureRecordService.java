package com.inclass1.service;

import com.inclass1.TemperatureConverter;
import com.inclass1.dao.TemperatureRecordDAO;
import com.inclass1.model.TemperatureRecord;

import java.sql.SQLException;
import java.util.List;

public class TemperatureRecordService {
	private final TemperatureConverter converter = new TemperatureConverter();
	private final TemperatureRecordDAO dao = new TemperatureRecordDAO();

	public TemperatureRecord add(String type, double value) throws SQLException {
		double result = switch (type) {
			case "Fahrenheit to Celsius" -> converter.fahrenheitToCelsius(value);
			case "Celsius to Fahrenheit" -> converter.celsiusToFahrenheit(value);
			case "Kelvin to Celsius" -> converter.kelvinToCelsius(value);
			default -> throw new IllegalArgumentException("Unknown temperature type");
		};

		TemperatureRecord record = new TemperatureRecord(type, value, result);

		dao.add(record);
		
		return record;
	}

	public List<TemperatureRecord> getAll() throws SQLException {
		return dao.getAll();
	}
}
