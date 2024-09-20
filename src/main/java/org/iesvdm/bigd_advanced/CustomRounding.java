package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CustomRounding {

    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("123.4567");

        // Custom rounding strategy: round up if the decimal part is > 0.25
        BigDecimal customRounded = customRound(value);
        System.out.println("Custom Rounded Value: " + customRounded);
    }

    public static BigDecimal customRound(BigDecimal value) {
        BigDecimal fraction = value.remainder(BigDecimal.ONE); // Get the decimal part
        if (fraction.compareTo(new BigDecimal("0.25")) > 0) {
            return value.setScale(0, RoundingMode.CEILING); // Round up
        } else {
            return value.setScale(0, RoundingMode.FLOOR);   // Round down
        }
    }

}
