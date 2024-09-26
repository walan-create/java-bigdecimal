package Ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejercicio4 {
    public static void main(String[] args) {
        Posicion Igualada = new Posicion(41.57879F, 1.617221F);
        Posicion Granada = new Posicion(37.176487F, -3.597929F);
        BigDecimal distancia = Extensiones.distanciaKm(Igualada, Granada);
        System.out.println("Distancia: " + distancia.setScale(0, RoundingMode.HALF_UP) + " km");
    }
}
