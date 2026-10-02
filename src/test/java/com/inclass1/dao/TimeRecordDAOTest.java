package com.inclass1.dao;

import com.inclass1.TestDatabase;
import com.inclass1.model.TimeRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeRecordDAOTest {
    private final TimeRecordDAO dao = new TimeRecordDAO();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void savesAndLoadsTimeRecord() throws Exception {
        dao.add(new TimeRecord(60, 120, 2));

        TimeRecord record = dao.getAll().get(0);
        assertEquals(60, record.getSpeedValue());
        assertEquals(120, record.getDistanceValue());
        assertEquals(2, record.getTimeValue());
    }
}
