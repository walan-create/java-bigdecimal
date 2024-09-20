package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation {

    public static void main(String[] args) {
        BigDecimal itemPrice = new BigDecimal("1000.00");
        BigDecimal stateTaxRate = new BigDecimal("0.07"); // 7% state tax
        BigDecimal federalTaxRate = new BigDecimal("0.05"); // 5% federal tax
        BigDecimal localTaxRate = new BigDecimal("0.03"); // 3% local tax

        BigDecimal stateTax = calculateTax(itemPrice, stateTaxRate);
        BigDecimal federalTax = calculateTax(itemPrice, federalTaxRate);
        BigDecimal localTax = calculateTax(itemPrice, localTaxRate);

        BigDecimal totalPrice = itemPrice.add(stateTax).add(federalTax).add(localTax);

        System.out.println("State Tax: " + stateTax);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("Local Tax: " + localTax);
        System.out.println("Total Price: " + totalPrice);
    }

    public static BigDecimal calculateTax(BigDecimal price, BigDecimal taxRate) {
        return price.multiply(taxRate).setScale(2, RoundingMode.HALF_UP);
    }

}
