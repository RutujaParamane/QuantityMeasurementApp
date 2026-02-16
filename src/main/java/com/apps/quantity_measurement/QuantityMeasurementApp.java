package com.apps.quantity_measurement;

/**
 * UC1 & UC2: Measurement equality
 * UC1 -> Feet equality; UC2 -> Inches equality (no cross-unit comparison yet).
 */
public class QuantityMeasurementApp {

    /**
     * Immutable value object representing a feet measurement.
     * (UC1)
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

    /**
     * Immutable value object representing an inches measurement.
     * (UC2)
     */
    public static final class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        /**
         * Equality contract mirrors Feet.
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " in";
        }
    }
    

//private static String fmt(Length q) {
//        // Force the text to match your screenshot exactly
//        String unitText = (q.getUnit() == LengthUnit.FEET) ? "feet" : "inch";
//        return "Quantity(" + q.getValue() + ", \"" + unitText + "\")";
//    }

    
 // ===== UC5 helpers (add inside QuantityMeasurementApp) =====

 // (Optional) Public API like in your doc/screenshots
 public static Length demonstrateLengthConversion(double value, LengthUnit from, LengthUnit to) {
     return new Length(value, from).convertTo(to);
 }

 public static Length demonstrateLengthConversion(Length length, LengthUnit to) {
     return length.convertTo(to);
 }

 // Pretty-printer to match the exact output format
 private static void printConversion(double value, LengthUnit from, LengthUnit to) {
     Length result = demonstrateLengthConversion(value, from, to);
     System.out.println("Input: convert(" + fmtNumber(value) + ", " + from + ", " + to + ")  \u2192  Output: " + fmtNumber(result.getValue()));
 }

 // Format numbers to match examples:
 // - Up to 6 decimals for fractional cases (0.393701)
 // - Trim trailing zeros
 // - Force ".0" for integers (12 -> 12.0)
 private static String fmtNumber(double v) {
     String s = String.format(java.util.Locale.US, "%.6f", v);
     s = s.replaceAll("0+$", "").replaceAll("\\.$", "");
     if (!s.contains(".")) s = s + ".0";
     return s;
 }

    // Optional console demo (kept for verification; not required for tests)
    public static void main(String[] args) {
//        Feet f1 = new Feet(1.0);
//        Feet f2 = new Feet(1.0);
//        System.out.println("Feet Input: " + f1 + " and " + f2);
//        System.out.println("Feet Equal: " + f1.equals(f2)); // Expected: true
//
//        Inches i1 = new Inches(1.0);
//        Inches i2 = new Inches(1.0);
//        System.out.println("Inches Input: " + i1 + " and " + i2);
//        System.out.println("Inches Equal: " + i1.equals(i2)); // Expected: true
        
//
//
//    	// UC3: 1.0 feet vs 12.0 inch -> Equal (true)
//    	        Length q1 = new Length(1.0, LengthUnit.FEET);
//    	        Length q2 = new Length(12.0, LengthUnit.INCHES);
//    	        System.out.println("Input: " + fmt(q1) + " and " + fmt(q2));
//    	        System.out.println("Output: Equal (" + q1.equals(q2) + ")");
//
//    	        // UC3: 1.0 inch vs 1.0 inch -> Equal (true)
//    	        Length q3 = new Length(1.0, LengthUnit.INCHES);
//    	        Length q4 = new Length(1.0, LengthUnit.INCHES);
//    	        System.out.println("Input: " + fmt(q3) + " and " + fmt(q4));
//    	        System.out.println("Output: Equal (" + q3.equals(q4) + ")");

    	// UC4
//    	Length y1 = new Length(1.0, LengthUnit.YARDS);
//    	Length f3 = new Length(3.0, LengthUnit.FEET);
//    	System.out.println("Input: Quantity(1.0, \"yards\") and Quantity(3.0, \"feet\")");
//    	System.out.println("Output: Equal (" + y1.equals(f3) + ")");
//
//    	Length c1 = new Length(1.0, LengthUnit.CENTIMETERS);
//    	Length i1 = new Length(0.393701, LengthUnit.INCHES);
//    	System.out.println("Input: Quantity(1.0, \"centimeters\") and Quantity(0.393701, \"inch\")");
//    	System.out.println("Output: Equal (" + c1.equals(i1) + ")");
        

    	// UC5: Example Output of running the App
    	    printConversion(1.0, LengthUnit.FEET,        LengthUnit.INCHES);     // 12.0
    	    printConversion(3.0, LengthUnit.YARDS,       LengthUnit.FEET);       // 9.0
    	    printConversion(36.0, LengthUnit.INCHES,     LengthUnit.YARDS);      // 1.0
    	    printConversion(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES);     // ~0.393701
    	    printConversion(0.0, LengthUnit.FEET,        LengthUnit.INCHES);     // 0.0


    }
}