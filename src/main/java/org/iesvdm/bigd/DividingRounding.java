package org.iesvdm.bigd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DividingRounding {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("3");

        // Division with rounding mode
        BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println("Result: " + result);  // Output: 3.33
    }

}
