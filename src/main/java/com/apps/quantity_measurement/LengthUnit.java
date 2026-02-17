package com.apps.quantity_measurement;

/**
 * Enum of supported length units.
 * Base unit = INCHES (so factors are "how many inches in 1 unit").
 */
public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),          // 1 yard = 36 inches (3 feet)
    CENTIMETERS(0.393701);// 1 cm   = 0.393701 inches

    private final double toInchesFactor;

    LengthUnit(double toInchesFactor) {
        this.toInchesFactor = toInchesFactor;
    }

    /** @return how many inches make 1 unit of this type */
    public double toInchesFactor() {
        return toInchesFactor;
    }
}