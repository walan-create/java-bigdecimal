package org.iesvdm.bigd;

import java.math.BigDecimal;

public class ZeroDivision {

    public static void main(String[] args) {
        try {
            BigDecimal num1 = new BigDecimal("10");
            BigDecimal zero = new BigDecimal("0");

            // This will throw ArithmeticException
            BigDecimal result = num1.divide(zero);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

}
