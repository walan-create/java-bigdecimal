package Ejercicios;

import java.math.BigDecimal;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Supongamos que tomas un préstamo de 200,000€ con una tasa de interés anual del 5% para pagarse en 30 años.

        BigDecimal prestamo = new BigDecimal("200000");
        BigDecimal interes = new BigDecimal("0.05");
        int anios = 30;
        int numeroPagos = anios * 12;

        BigDecimal tasaInteresMensual = interes.divide(BigDecimal.valueOf(12), 10, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal numerador = prestamo.multiply(tasaInteresMensual);
        BigDecimal denominador = BigDecimal.ONE.add(tasaInteresMensual);
        denominador = BigDecimal.ONE.divide(denominador.pow(numeroPagos), 10, BigDecimal.ROUND_HALF_EVEN);
        denominador = BigDecimal.ONE.subtract(denominador);
        BigDecimal pagoMensualPeriodico = numerador.divide(denominador, 2, BigDecimal.ROUND_HALF_EVEN);

        System.out.println("Prestamo: " + prestamo);
        System.out.println("Interes: " + interes);
        System.out.println("Numero de pagos: " + numeroPagos);
        System.out.println("Esquema de amortización \n ----------------------");
        System.out.println("Mes | Pago | Principal| Interes | Balance");

        BigDecimal saldo = prestamo;
        int contador = 1;
        do {
            BigDecimal interesMensual = saldo.multiply(tasaInteresMensual);
            BigDecimal principalMensual = pagoMensualPeriodico.subtract(interesMensual);
            principalMensual = principalMensual.setScale(2, BigDecimal.ROUND_HALF_EVEN);

            System.out.println(contador + " | " + pagoMensualPeriodico + " | " + principalMensual + " | " + interesMensual + " | " + saldo);
            saldo=saldo.subtract(principalMensual);
            contador++;
        } while (saldo.compareTo(BigDecimal.ZERO) >= 0);


    }
}
