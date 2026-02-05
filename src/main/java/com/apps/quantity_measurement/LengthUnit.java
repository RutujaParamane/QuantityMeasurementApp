package com.apps.quantity_measurement;

/**
 * Enum of supported length units.
 * Base unit = INCHES (so factors are "how many inches in 1 unit").
 */
public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0);

    private final double toInchesFactor;

    LengthUnit(double toInchesFactor) {
        this.toInchesFactor = toInchesFactor;
    }

    /**
     * @return how many inches make 1 unit of this type
     */
    public double toInchesFactor() {
        return toInchesFactor;
    }
}
