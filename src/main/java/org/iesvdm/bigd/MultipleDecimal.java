package org.iesvdm.bigd;

import java.math.BigDecimal;

public class MultipleDecimal {

    public static void main(String[] args) {
        BigDecimal salary1 = new BigDecimal("1000.50");
        BigDecimal salary2 = new BigDecimal("2000.75");
        BigDecimal salary3 = new BigDecimal("3000.25");

        BigDecimal totalSalary = salary1.add(salary2).add(salary3);

        System.out.println("Total Salary: " + totalSalary);  // Output: 6001.50
    }
}
