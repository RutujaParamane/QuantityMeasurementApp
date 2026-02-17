package com.apps.quantity_measurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import com.apps.quantity_measurement.QuantityMeasurementApp.Feet;
//import com.apps.quantity_measurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    /* ---------------- FEET TESTS (UC1) ---------------- */

//    @Test
//    void testFeetEquality_SameValue() {
//        Feet a = new Feet(1.0);
//        Feet b = new Feet(1.0);
//        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
//    }
//
//    @Test
//    void testFeetEquality_DifferentValue() {
//        Feet a = new Feet(1.0);
//        Feet b = new Feet(2.0);
//        assertFalse(a.equals(b), "1.0 ft should not equal 2.0 ft");
//    }
//
//    @Test
//    void testFeetEquality_NullComparison() {
//        Feet a = new Feet(1.0);
//        assertFalse(a.equals(null), "Feet should not be equal to null");
//    }
//
//    @Test
//    @SuppressWarnings("unlikely-arg-type")
//    void testFeetEquality_DifferentClass() {
//        Feet a = new Feet(1.0);
//        assertFalse(a.equals("1.0"), "Feet should not equal a String (non-numeric input case)");
//    }
//
//    @Test
//    void testFeetEquality_SameReference() {
//        Feet a = new Feet(1.0);
//        assertTrue(a.equals(a), "Object must equal itself (reflexive)");
//    }
//
//    /* ---------------- INCHES TESTS (UC2) ---------------- */
//
//    @Test
//    void testInchesEquality_SameValue() {
//        Inches a = new Inches(1.0);
//        Inches b = new Inches(1.0);
//        assertTrue(a.equals(b), "1.0 in should equal 1.0 in");
//    }
//
//    @Test
//    void testInchesEquality_DifferentValue() {
//        Inches a = new Inches(1.0);
//        Inches b = new Inches(2.0);
//        assertFalse(a.equals(b), "1.0 in should not equal 2.0 in");
//    }
//
//    @Test
//    void testInchesEquality_NullComparison() {
//        Inches a = new Inches(1.0);
//        assertFalse(a.equals(null), "Inches should not be equal to null");
//    }
//
//    @Test
//    @SuppressWarnings("unlikely-arg-type")
//    void testInchesEquality_DifferentClass() {
//        Inches a = new Inches(1.0);
//        assertFalse(a.equals(1.0), "Inches should not equal a Double (different type)");
//    }
//
//    @Test
//    void testInchesEquality_SameReference() {
//        Inches a = new Inches(1.0);
//        assertTrue(a.equals(a), "Object must equal itself (reflexive)");
//    }
//    
//    @Test
//    void testInchesEquality_Symmetric() {
//        Inches a = new Inches(2.5);
//        Inches b = new Inches(2.5);
//        assertTrue(a.equals(b) && b.equals(a), "Equality must be symmetric");
//    }
//
//    @Test
//    void testInchesEquality_Transitive() {
//        Inches a = new Inches(3.0);
//        Inches b = new Inches(3.0);
//        Inches c = new Inches(3.0);
//        assertTrue(a.equals(b) && b.equals(c) && a.equals(c), "Equality must be transitive");
//    }
//
//    @Test
//    void testInchesEquality_ConsistentOnRepeatedCalls() {
//        Inches a = new Inches(4.0);
//        Inches b = new Inches(4.0);
//        for (int i = 0; i < 5; i++) {
//            assertTrue(a.equals(b), "Equality should be consistent across multiple invocations");
//        }
//    }
    
    //UC3
    
 // 1) Same-unit equality
//    @Test
//    public void testEquality_FeetToFeet_SameValue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    public void testEquality_InchToInch_SameValue() {
//        Length l1 = new Length(1.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.INCHES);
//        assertEquals(l1, l2);
//    }
//
//    // 2) Cross-unit equality (1 ft == 12 in)
//    @Test
//    public void testEquality_FeetToInch_EquivalentValue() {
//        Length feet = new Length(1.0, LengthUnit.FEET);
//        Length inches = new Length(12.0, LengthUnit.INCHES);
//        assertEquals(feet, inches);
//    }
//
//    @Test
//    public void testEquality_InchToFeet_EquivalentValue() {
//        Length inches = new Length(12.0, LengthUnit.INCHES);
//        Length feet = new Length(1.0, LengthUnit.FEET);
//        assertEquals(inches, feet); // symmetry
//    }
//
//    // 3) Inequality (different values)
//    @Test
//    public void testInequality_FeetToFeet_DifferentValue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//        assertNotEquals(l1, l2);
//    }
//
//    @Test
//    public void testInequality_InchToInch_DifferentValue() {
//        Length l1 = new Length(1.0, LengthUnit.INCHES);
//        Length l2 = new Length(2.0, LengthUnit.INCHES);
//        assertNotEquals(l1, l2);
//    }
//
//    // 4) Null safety / type safety
//    @Test
//    public void testEquality_NullComparison_False() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        assertNotEquals(l1, null);
//    }
//
//    @Test
//    public void testEquality_SameReference_True() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        assertTrue(l1.equals(l1));
//    }
//
//    // 5) Validation paths
//    @Test
//    public void testInvalid_Unit_Null_Throws() {
//        assertThrows(IllegalArgumentException.class,
//            () -> new Length(1.0, null));
//    }
//
//    @Test
//    public void testInvalid_Value_NaN_Throws() {
//        assertThrows(IllegalArgumentException.class,
//            () -> new Length(Double.NaN, LengthUnit.FEET));
//    }
	
	//uc4
	// ---------- Yard <-> Yard ----------
    @Test
    void testEquality_YardToYard_SameValue() {
        assertEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(1.0, LengthUnit.YARDS)
        );
    }

    @Test
    void testEquality_YardToYard_DifferentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(2.0, LengthUnit.YARDS)
        );
    }

    // ---------- Yard <-> Feet ----------
    @Test
    void testEquality_YardToFeet_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(3.0, LengthUnit.FEET)
        );
    }

    @Test
    void testEquality_FeetToYard_EquivalentValue() {
        assertEquals(
                new Length(3.0, LengthUnit.FEET),
                new Length(1.0, LengthUnit.YARDS)
        );
    }

    // ---------- Yard <-> Inches ----------
//    @Test
//    void testEquality_YardToInches_EquivalentValue() {
//        assertEquals(
//                new Length(1.0, LengthUnit.YARDS),
//                new Length(36.0, LengthUnit.INCHES)
//        );
//    }
//
//    @Test
//    void testInequality_YardToFeet_NonEquivalentValue() {
//        assertNotEquals(
//                new Length(1.0, LengthUnit.YARDS),
//                new Length(2.0, LengthUnit.FEET)
//        );
//    }
//
//    // ---------- Centimeters ----------
//    @Test
//    void testEquality_CentimetersToCentimeters_SameValue() {
//        assertEquals(
//                new Length(2.0, LengthUnit.CENTIMETERS),
//                new Length(2.0, LengthUnit.CENTIMETERS)
//        );
//    }
//
//    @Test
//    void testEquality_CentimetersToInches_EquivalentValue() {
//        assertEquals(
//                new Length(1.0, LengthUnit.CENTIMETERS),
//                new Length(0.393701, LengthUnit.INCHES)
//        );
//    }
//
//    @Test
//    void testInequality_CentimetersToFeet_NonEquivalentValue() {
//        assertNotEquals(
//                new Length(1.0, LengthUnit.CENTIMETERS),
//                new Length(1.0, LengthUnit.FEET)
//        );
//    }
//
//    // ---------- Multi-unit transitive property ----------
//    @Test
//    void testEquality_MultiUnit_TransitiveProperty() {
//        Length yard   = new Length(1.0, LengthUnit.YARDS);
//        Length feet   = new Length(3.0, LengthUnit.FEET);
//        Length inches = new Length(36.0, LengthUnit.INCHES);
//
//        assertEquals(yard, feet);
//        assertEquals(feet, inches);
//        assertEquals(yard, inches);
//    }
//
//    // ---------- Sanity checks with null/reference ----------
//    @Test
//    void testYard_SameReference() {
//        Length a = new Length(1.0, LengthUnit.YARDS);
//        assertTrue(a.equals(a));
//    }
//
//    @Test
//    void testYard_NullComparison() {
//        Length a = new Length(1.0, LengthUnit.YARDS);
//        assertNotEquals(a, null);
//    }

    /* ---------------- UC5: Unit-to-Unit Conversion ---------------- */

    private static final double EPS_UC5 = 1e-6;

    /** 1) Feet → Inches: 1 ft = 12 in */
    @Test
    void testConversion_FeetToInches() {
        Length out = new Length(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES);
        assertEquals(12.0, out.getValue(), EPS_UC5);
    }

    /** 2) Inches → Feet: 24 in = 2 ft */
    @Test
    void testConversion_InchesToFeet() {
        Length out = new Length(24.0, LengthUnit.INCHES).convertTo(LengthUnit.FEET);
        assertEquals(2.0, out.getValue(), EPS_UC5);
    }

    /** 3) Yards → Inches: 1 yd = 36 in */
    @Test
    void testConversion_YardsToInches() {
        Length out = new Length(1.0, LengthUnit.YARDS).convertTo(LengthUnit.INCHES);
        assertEquals(36.0, out.getValue(), EPS_UC5);
    }

    /** 4) Inches → Yards: 72 in = 2 yd */
    @Test
    void testConversion_InchesToYards() {
        Length out = new Length(72.0, LengthUnit.INCHES).convertTo(LengthUnit.YARDS);
        assertEquals(2.0, out.getValue(), EPS_UC5);
    }

    /** 5) Centimeters → Inches: 2.54 cm ≈ 1 in */
    @Test
    void testConversion_CentimetersToInches() {
        Length out = new Length(2.54, LengthUnit.CENTIMETERS).convertTo(LengthUnit.INCHES);
        assertEquals(1.0, out.getValue(), EPS_UC5);
    }

    /** 6) Feet → Yards: 6 ft = 2 yd */
    @Test
    void testConversion_FeetToYard() {
        Length out = new Length(6.0, LengthUnit.FEET).convertTo(LengthUnit.YARDS);
        assertEquals(2.0, out.getValue(), EPS_UC5);
    }

    /**
     * 7) Round-trip preserves value within tolerance:
     * v (A) → B → A ≈ v
     */
    @Test
    void testConversion_RoundTrip_PreservesValue() {
        double v = 5.5;
        Length aToB = new Length(v, LengthUnit.FEET).convertTo(LengthUnit.INCHES);
        Length backToA = aToB.convertTo(LengthUnit.FEET);
        assertEquals(v, backToA.getValue(), EPS_UC5);
    }

    /** 8) Zero converts to zero */
    @Test
    void testConversion_ZeroValue() {
        Length out = new Length(0.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES);
        assertEquals(0.0, out.getValue(), EPS_UC5);
    }

    /** 9) Negative values preserve sign: -1 ft = -12 in */
    @Test
    void testConversion_NegativeValue() {
        Length out = new Length(-1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES);
        assertEquals(-12.0, out.getValue(), EPS_UC5);
    }

    /** 10) Invalid unit handling: null target should throw */
    @Test
    void testConversion_InvalidUnit_Throws() {
        assertThrows(IllegalArgumentException.class,
                () -> new Length(1.0, LengthUnit.FEET).convertTo(null));
    }

    /**
     * 11) NaN / Infinite value should fail via constructor validation
     * (your Length constructor already validates finite values)
     */
    @Test
    void testConversion_NaNOrInfinite_Throws() {
        assertThrows(IllegalArgumentException.class,
                () -> new Length(Double.NaN, LengthUnit.INCHES));
        assertThrows(IllegalArgumentException.class,
                () -> new Length(Double.POSITIVE_INFINITY, LengthUnit.FEET));
        assertThrows(IllegalArgumentException.class,
                () -> new Length(Double.NEGATIVE_INFINITY, LengthUnit.YARDS));
    }

    /**
     * 12) Precision tolerance: check a known fractional result
     * 1 cm ≈ 0.393701 in (base inches)
     */
    @Test
    void testConversion_PrecisionTolerance() {
        Length out = new Length(1.0, LengthUnit.CENTIMETERS).convertTo(LengthUnit.INCHES);
        assertEquals(0.393701, out.getValue(), EPS_UC5);
    }


}