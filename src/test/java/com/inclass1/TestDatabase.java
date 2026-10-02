package com.inclass1;

import com.inclass1.db.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public final class TestDatabase {
    private TestDatabase() {
    }

    public static void reset() throws SQLException {
        System.setProperty("db.url", "jdbc:h2:mem:inclass;MODE=MySQL;DB_CLOSE_DELAY=-1");
        System.setProperty("db.user", "sa");
        System.setProperty("db.password", "");

        try (Connection connection = DatabaseConnection.getConnection(); Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS temperature_records");
            statement.execute("DROP TABLE IF EXISTS time_records");
            statement.execute("CREATE TABLE temperature_records (id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "type VARCHAR(50) NOT NULL, from_temperature DECIMAL(10,2) NOT NULL, "
                    + "to_temperature DECIMAL(10,2) NOT NULL)");
            statement.execute("CREATE TABLE time_records (id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "speed DECIMAL(10,2) NOT NULL, distance DECIMAL(10,2) NOT NULL, `time` DECIMAL(10,2) NOT NULL)");
        }
    }
}
