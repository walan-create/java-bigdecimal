package org.iesvdm.bigd;

import java.math.BigDecimal;

public class ExactPrecisionAvoidingFloatDouble {

    public static void main(String[] args) {
        double doubleValue = 1.1;
        BigDecimal fromDouble = new BigDecimal(doubleValue); // Not recommended

        BigDecimal preciseValue = new BigDecimal("1.1");     // Recommended

        System.out.println("From double: " + fromDouble);    // Output: 1.1000000000000000888
        System.out.println("From String: " + preciseValue);  // Output: 1.1
    }

}
