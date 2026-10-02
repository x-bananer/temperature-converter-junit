package com.inclass1.dao;

import com.inclass1.TestDatabase;
import com.inclass1.model.TemperatureRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureRecordDAOTest {
    private final TemperatureRecordDAO dao = new TemperatureRecordDAO();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void savesAndLoadsTemperatureRecord() throws Exception {
        dao.add(new TemperatureRecord("Fahrenheit to Celsius", 32, 0));

        TemperatureRecord record = dao.getAll().get(0);
        assertEquals("Fahrenheit to Celsius", record.getType());
        assertEquals(32, record.getFromTemperature());
        assertEquals(0, record.getToTemperature());
    }
}
