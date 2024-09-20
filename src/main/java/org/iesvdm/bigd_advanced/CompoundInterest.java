package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterest {
    public static void main(String[] args) {
        BigDecimal principal = new BigDecimal("10000.00");
        BigDecimal rate = new BigDecimal("0.05"); // 5% annual interest
        int years = 10;
        int timesCompounded = 4; // Quarterly

        BigDecimal amount = calculateCompoundInterest(principal, rate, years, timesCompounded);
        System.out.println("Amount after " + years + " years: " + amount);
    }

    public static BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal rate, int years, int timesCompounded) {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal rateDivided = rate.divide(new BigDecimal(timesCompounded), 10, RoundingMode.HALF_UP);
        BigDecimal exponent = new BigDecimal(timesCompounded * years);

        BigDecimal base = one.add(rateDivided);
        BigDecimal result = principal.multiply(base.pow(exponent.intValueExact()));

        return result.setScale(2, RoundingMode.HALF_UP);
    }
}
