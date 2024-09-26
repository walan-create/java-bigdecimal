package Ejercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el monto de la inversión");
        BigDecimal monto = new BigDecimal(sc.next());
        System.out.println("Dame el porcentaje de ganancia");
        BigDecimal porcentaje= new BigDecimal(sc.next());
        porcentaje = porcentaje.divide(BigDecimal.valueOf(100), MathContext.DECIMAL32);
        System.out.println("Dime los años");
        int anios=sc.nextInt();

        BigDecimal unoMasTasaInteres = BigDecimal.ONE.add(porcentaje);
        BigDecimal unoMasTasaInteresElevado = unoMasTasaInteres.pow(anios);
        BigDecimal mf = monto.multiply(unoMasTasaInteresElevado);
        System.out.println(mf.setScale(10, BigDecimal.ROUND_HALF_UP));
    }
}