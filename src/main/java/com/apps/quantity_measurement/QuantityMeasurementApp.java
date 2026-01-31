package com.apps.quantity_measurement;

/**
 * UC1: Feet measurement equality
 * Responsible for checking equality of two numerical values measured in feet.
 */
public class QuantityMeasurementApp {

    /**
     * Immutable value object representing a feet measurement.
     */
    public static final class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        /**
         * Equality contract:
         * 1) Same reference -> true
         * 2) Null or different type -> false
         * 3) Compare double values using Double.compare
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;                                   // 1. reference
            if (obj == null || getClass() != obj.getClass()) return false;   // 2. null/type
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;             // 3. value
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value); // keeps equals/hashCode consistent
        }

        @Override
        public String toString() {
            return value + " ft";
        }
    }

    // Optional demo (not required for tests)
    public static void main(String[] args) {
        Feet a = new Feet(1.0);
        Feet b = new Feet(1.0);
        System.out.println("Input: " + a + " and " + b);
        System.out.println("Equal: " + a.equals(b)); // Expected: true
    }
}