package com.inclass1.service;

import com.inclass1.TestDatabase;
import com.inclass1.model.TimeRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeRecordServiceTest {
    private final TimeRecordService service = new TimeRecordService();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void calculatesAndSavesTime() throws Exception {
        TimeRecord record = service.add(60, 120);

        assertEquals(2, record.getTimeValue());
        assertEquals(1, service.getAll().size());
    }
}
