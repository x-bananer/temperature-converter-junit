package com.inclass1.controller;

import com.inclass1.model.TimeRecord;
import com.inclass1.service.TimeRecordService;

import java.sql.SQLException;
import java.util.List;

public class TimeRecordController {
    private final TimeRecordService service = new TimeRecordService();

    public TimeRecord add(String speed, String distance) throws SQLException {
        return service.add(Double.parseDouble(speed), Double.parseDouble(distance));
    }

    public List<TimeRecord> getAll() throws SQLException {
        return service.getAll();
    }
}
