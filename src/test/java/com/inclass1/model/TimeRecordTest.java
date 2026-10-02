package com.inclass1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeRecordTest {
    @Test
    void formatsValuesWithUnits() {
        TimeRecord record = new TimeRecord(60, 120, 2);

        assertEquals("60.0 km/h", record.getSpeed());
        assertEquals("120.0 km", record.getDistance());
        assertEquals("2.0 h", record.getTime());
    }
}
