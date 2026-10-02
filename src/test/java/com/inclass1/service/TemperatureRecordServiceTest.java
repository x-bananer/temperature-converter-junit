package com.inclass1.service;

import com.inclass1.TestDatabase;
import com.inclass1.model.TemperatureRecord;
import com.inclass1.model.TemperatureType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureRecordServiceTest {
    private final TemperatureRecordService service = new TemperatureRecordService();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void convertsAndSavesTemperature() throws Exception {
        TemperatureRecord record = service.add(new TemperatureType(2, "Celsius to Fahrenheit"), 100);

        assertEquals(212, record.getToTemperature());
        assertEquals(1, service.getAll().size());
    }
}
