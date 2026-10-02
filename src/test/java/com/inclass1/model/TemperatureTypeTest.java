package com.inclass1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTypeTest {
    @Test
    void displaysTypeName() {
        TemperatureType type = new TemperatureType(1, "Fahrenheit to Celsius");

        assertEquals(1, type.getId());
        assertEquals("Fahrenheit to Celsius", type.toString());
    }
}
