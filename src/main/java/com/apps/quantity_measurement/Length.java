package com.apps.quantity_measurement;
import java.util.Objects;

/**
 * UC3: Generic quantity for Length.
 * Stores a numeric value and a unit; equality compares after converting to base (inches).
 */
public final class Length {
    private final double value;
    private final LengthUnit unit;

    // small tolerance to account for floating-point rounding (optional but safe)
    private static final double EPS = 1e-9;

    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        // Optional: validate value is finite
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Value must be a finite number");
        }
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    /** Convert current value to base unit (inches). */
    private double toBaseInches() {
        return value * unit.toInchesFactor();
    }

    /** Compare after converting both to base (inches). */
    public boolean compare(Length other) {
        if (other == null) return false;
        return Math.abs(this.toBaseInches() - other.toBaseInches()) <= EPS;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                       // reflexive
        if (obj == null || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;
        return compare(other);                               // value-based after conversion
    }

    @Override
    public int hashCode() {
        // Normalize to base to keep equals/hashCode consistent
        return Objects.hash(Math.round(toBaseInches() / EPS));
    }

    @Override
    public String toString() {
        return value + " " + unit.name().toLowerCase();
    }
}
