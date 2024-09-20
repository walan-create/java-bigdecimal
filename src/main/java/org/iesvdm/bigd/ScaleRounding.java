package org.iesvdm.bigd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ScaleRounding {

    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("12.34567");

        // Set scale with rounding
        BigDecimal rounded = num.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Rounded to 2 decimal places: " + rounded);  // Output: 12.35
    }
}
