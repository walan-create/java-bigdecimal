package org.iesvdm.bigd_advanced;

import java.math.BigDecimal;
import java.math.MathContext;

public class LargeScaleScientific {

    public static void main(String[] args) {
        // Example: Planck's constant h (6.62607015 × 10^-34)
        BigDecimal plancksConstant = new BigDecimal("6.62607015E-34", MathContext.DECIMAL128);

        // Example: Speed of light in meters per second (299,792,458 m/s)
        BigDecimal speedOfLight = new BigDecimal("299792458", MathContext.DECIMAL128);

        // Calculate energy (E = h * c)
        BigDecimal energy = plancksConstant.multiply(speedOfLight);

        System.out.println("Energy: " + energy.toString());  // Output will be extremely precise
    }
}
