package com.apps.quantity_measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantity_measurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality_SameValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(1.0);
        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
    }

    @Test
    void testFeetEquality_DifferentValue() {
        Feet a = new Feet(1.0);
        Feet b = new Feet(2.0);
        assertFalse(a.equals(b), "1.0 ft should not equal 2.0 ft");
    }

    @Test
    void testFeetEquality_NullComparison() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals(null), "Feet should not be equal to null");
    }

    @Test
    @SuppressWarnings("unlikely-arg-type")
    void testFeetEquality_DifferentClass() {
        Feet a = new Feet(1.0);
        assertFalse(a.equals("1.0"), "Feet should not equal a String (non-numeric input case)");
    }

    @Test
    void testFeetEquality_SameReference() {
        Feet a = new Feet(1.0);
        assertTrue(a.equals(a), "Object must equal itself (reflexive)");
    }
}