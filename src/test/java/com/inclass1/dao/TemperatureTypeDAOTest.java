package com.inclass1.dao;

import com.inclass1.TestDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTypeDAOTest {
    private final TemperatureTypeDAO dao = new TemperatureTypeDAO();

    @BeforeEach
    void setUp() throws Exception {
        TestDatabase.reset();
    }

    @Test
    void loadsTemperatureTypes() throws Exception {
        assertEquals(3, dao.getAll().size());
        assertEquals("Fahrenheit to Celsius", dao.getAll().get(0).getName());
    }
}
