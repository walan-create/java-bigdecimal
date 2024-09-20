package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinancialForecasting {

    public static void main(String[] args) {
        BigDecimal initialInvestment = new BigDecimal("10000");
        BigDecimal annualGrowthRate = new BigDecimal("0.06"); // 6% annual growth
        int years = 5;

        BigDecimal futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);

        System.out.println("Future Value after " + years + " years: " + futureValue);
    }

    public static BigDecimal calculateFutureValue(BigDecimal principal, BigDecimal growthRate, int years) {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal compoundFactor = one.add(growthRate).pow(years);
        return principal.multiply(compoundFactor).setScale(2, RoundingMode.HALF_UP);
    }

}
