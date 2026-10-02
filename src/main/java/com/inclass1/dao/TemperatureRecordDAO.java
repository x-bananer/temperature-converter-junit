package com.inclass1.dao;

import com.inclass1.db.DatabaseConnection;
import com.inclass1.model.TemperatureRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TemperatureRecordDAO {

	public void add(TemperatureRecord record) throws SQLException {
		String sql = "INSERT INTO temperature_records (type, from_temperature, to_temperature) VALUES (?, ?, ?)";

		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, record.getType());
			statement.setDouble(2, record.getFromTemperature());
			statement.setDouble(3, record.getToTemperature());

			statement.executeUpdate();
		}
	}

	public List<TemperatureRecord> getAll() throws SQLException {
		List<TemperatureRecord> records = new ArrayList<>();
		String sql = "SELECT type, from_temperature, to_temperature FROM temperature_records ORDER BY id";

		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet result = statement.executeQuery()) {

			while (result.next()) {
				records.add(new TemperatureRecord(
						result.getString("type"),
						result.getDouble("from_temperature"),
						result.getDouble("to_temperature")));
			}
		}

		return records;
	}
}
