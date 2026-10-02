package com.inclass1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureRecordTest {
    @Test
    void formatsFahrenheitToCelsius() {
        TemperatureRecord record = new TemperatureRecord("Fahrenheit to Celsius", 32, 0);

        assertEquals("Fahrenheit to Celsius", record.getType());
        assertEquals("32.0 °F", record.getFrom());
        assertEquals("0.0 °C", record.getTo());
    }
}
