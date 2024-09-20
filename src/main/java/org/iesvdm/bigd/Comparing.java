package org.iesvdm.bigd;

import java.math.BigDecimal;

public class Comparing {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.00");
        BigDecimal num2 = new BigDecimal("10");

        // Using compareTo() method
        if (num1.compareTo(num2) == 0) {
            System.out.println("Both numbers are equal in value.");  // True
        }

        // Using equals() method
        if (num1.equals(num2)) {
            System.out.println("Both numbers are exactly equal.");   // False (Different scales)
        }
    }
}
