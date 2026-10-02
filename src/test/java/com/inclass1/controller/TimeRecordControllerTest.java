package com.inclass1.controller;

import com.inclass1.TestDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeRecordControllerTest {
    private final TimeRecordController controller = new TimeRecordController();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void acceptsTextFromViewAndCalculatesTime() throws Exception {
        controller.add("50", "100");

        assertEquals(1, controller.getAll().size());
        assertEquals(2, controller.getAll().get(0).getTimeValue());
    }
}
