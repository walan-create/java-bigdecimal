package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;

public class WeightedAverage {
    public static void main(String[] args) {
        BigDecimal grade1 = new BigDecimal("85.5");
        BigDecimal weight1 = new BigDecimal("0.4"); // 40% weight

        BigDecimal grade2 = new BigDecimal("90.2");
        BigDecimal weight2 = new BigDecimal("0.3"); // 30% weight

        BigDecimal grade3 = new BigDecimal("88.8");
        BigDecimal weight3 = new BigDecimal("0.3"); // 30% weight

        BigDecimal weightedAverage = calculateWeightedAverage(new BigDecimal[]{grade1, grade2, grade3},
                new BigDecimal[]{weight1, weight2, weight3});

        System.out.println("Weighted Average: " + weightedAverage);
    }

    public static BigDecimal calculateWeightedAverage(BigDecimal[] values, BigDecimal[] weights) {
        BigDecimal sumProduct = BigDecimal.ZERO;
        BigDecimal sumWeight = BigDecimal.ZERO;

        for (int i = 0; i < values.length; i++) {
            sumProduct = sumProduct.add(values[i].multiply(weights[i]));
            sumWeight = sumWeight.add(weights[i]);
        }

        return sumProduct.divide(sumWeight, 2, BigDecimal.ROUND_HALF_UP);
    }
}
