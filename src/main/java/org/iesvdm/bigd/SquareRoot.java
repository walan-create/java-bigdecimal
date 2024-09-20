package org.iesvdm.bigd;

import java.math.BigDecimal;

public class SquareRoot {

    public static void main(String[] args) {
        BigDecimal base = new BigDecimal("2");

        // Power calculation
        BigDecimal power = base.pow(3);  // 2^3 = 8

        System.out.println("2^3 = " + power);   // Output: 8

        // Square root calculation (Approximation using Math.sqrt)
        BigDecimal squareRoot = new BigDecimal(Math.sqrt(base.doubleValue()));
        System.out.println("Square Root of 2: " + squareRoot);   // Approximate Output: 1.414213
    }

}
