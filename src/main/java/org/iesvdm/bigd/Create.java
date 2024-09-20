package org.iesvdm.bigd;

import java.math.BigDecimal;

public class Create {

    public static void main(String[] args) {
        // Creating BigDecimal from String (Recommended)
        BigDecimal fromString = new BigDecimal("123.456");

        // Creating BigDecimal from double (Not recommended due to precision issues)
        BigDecimal fromDouble = new BigDecimal(123.456);

        System.out.println("From String: " + fromString);   // Output: 123.456
        System.out.println("From Double: " + fromDouble);   // Output may have precision issues
    }

}
