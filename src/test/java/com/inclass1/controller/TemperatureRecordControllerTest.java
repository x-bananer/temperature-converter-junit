package com.inclass1.controller;

import com.inclass1.TestDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureRecordControllerTest {
    private final TemperatureRecordController controller = new TemperatureRecordController();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void acceptsTextFromViewAndSavesIt() throws Exception {
        controller.add("Kelvin to Celsius", "273.15");

        assertEquals(1, controller.getAll().size());
        assertEquals(0, controller.getAll().get(0).getToTemperature());
    }
}
