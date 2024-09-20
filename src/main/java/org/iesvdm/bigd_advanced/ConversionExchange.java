package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversionExchange {
    public static void main(String[] args) {
        BigDecimal usdAmount = new BigDecimal("1500.00");
        BigDecimal exchangeRate = new BigDecimal("0.845");

        // Convert USD to EUR
        BigDecimal eurAmount = usdAmount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);
        System.out.println("USD to EUR: " + eurAmount);

        // Convert EUR back to USD
        BigDecimal reverseExchangeRate = BigDecimal.ONE.divide(exchangeRate, 5, RoundingMode.HALF_UP);
        BigDecimal originalUsdAmount = eurAmount.multiply(reverseExchangeRate).setScale(2, RoundingMode.HALF_UP);
        System.out.println("EUR to USD: " + originalUsdAmount);
    }
}
