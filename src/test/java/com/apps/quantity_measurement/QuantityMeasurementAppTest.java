package com.apps.quantity_measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantity_measurement.QuantityMeasurementApp.Feet;
import com.apps.quantity_measurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    /* ---------------- FEET TESTS (UC1) ---------------- */

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

    /* ---------------- INCHES TESTS (UC2) ---------------- */

    @Test
    void testInchesEquality_SameValue() {
        Inches a = new Inches(1.0);
        Inches b = new Inches(1.0);
        assertTrue(a.equals(b), "1.0 in should equal 1.0 in");
    }

    @Test
    void testInchesEquality_DifferentValue() {
        Inches a = new Inches(1.0);
        Inches b = new Inches(2.0);
        assertFalse(a.equals(b), "1.0 in should not equal 2.0 in");
    }

    @Test
    void testInchesEquality_NullComparison() {
        Inches a = new Inches(1.0);
        assertFalse(a.equals(null), "Inches should not be equal to null");
    }

    @Test
    @SuppressWarnings("unlikely-arg-type")
    void testInchesEquality_DifferentClass() {
        Inches a = new Inches(1.0);
        assertFalse(a.equals(1.0), "Inches should not equal a Double (different type)");
    }

    @Test
    void testInchesEquality_SameReference() {
        Inches a = new Inches(1.0);
        assertTrue(a.equals(a), "Object must equal itself (reflexive)");
    }
}