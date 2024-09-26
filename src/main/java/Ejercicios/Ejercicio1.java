package Ejercicios;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero para calcular el factorial");
        BigDecimal num = new BigDecimal(sc.next());
        int factorial = 1;
        for (int i=1;num.compareTo(BigDecimal.valueOf(i))>=0;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial: "+factorial);


    }
}
