package com.inclass1.service;

import com.inclass1.dao.TimeRecordDAO;
import com.inclass1.model.TimeRecord;

import java.sql.SQLException;
import java.util.List;

public class TimeRecordService {
	private final TimeRecordDAO dao = new TimeRecordDAO();

	public TimeRecord add(double speed, double distance) throws SQLException {
		TimeRecord record = new TimeRecord(speed, distance, distance / speed);
		dao.add(record);
		return record;
	}

	public List<TimeRecord> getAll() throws SQLException {
		return dao.getAll();
	}
}
