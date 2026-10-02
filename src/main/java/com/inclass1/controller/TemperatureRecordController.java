package com.inclass1.controller;

import com.inclass1.model.TemperatureRecord;
import com.inclass1.service.TemperatureRecordService;

import java.sql.SQLException;
import java.util.List;

public class TemperatureRecordController {
    private final TemperatureRecordService service = new TemperatureRecordService();

    public TemperatureRecord add(String type, String value) throws SQLException {
        return service.add(type, Double.parseDouble(value));
    }

    public List<TemperatureRecord> getAll() throws SQLException {
        return service.getAll();
    }
}
